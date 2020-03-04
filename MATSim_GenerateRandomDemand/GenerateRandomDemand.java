package org.matsim.session5;

import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.io.ParseException;
import com.vividsolutions.jts.io.WKTReader;
import org.matsim.api.core.v01.Coord;
import org.matsim.api.core.v01.Id;
import org.matsim.api.core.v01.Scenario;
import org.matsim.api.core.v01.population.*;
import org.matsim.core.config.ConfigUtils;
import org.matsim.core.gbl.MatsimRandom;
import org.matsim.core.scenario.ScenarioUtils;
import org.matsim.core.utils.geometry.CoordinateTransformation;
import org.matsim.core.utils.geometry.geotools.MGC;
import org.matsim.core.utils.geometry.transformations.TransformationFactory;
import org.matsim.core.utils.gis.ShapeFileReader;
import org.opengis.feature.simple.SimpleFeature;

import java.util.*;

public class GenerateRandomDemand {

    private Map<String, Geometry> shapeMap;
    private List<CommuterODInfo> commuterODInfoList = new ArrayList<>();
    private static final String COUNTIES = "D:\\TUM\\TS\\Semester 4\\MATSim\\session_5\\bayern_shp\\lkr_ex.shp";
    private static final String PLANSFILEOUTPUT = "src\\main\\java\\org\\matsim\\session5\\New_Plan.xml";
    private static final double SCALEFACTOR = 0.05;
    private Scenario scenario;

    //define the coordinate transformation function
    private final CoordinateTransformation transformation = TransformationFactory.getCoordinateTransformation
            ("EPSG:31468", TransformationFactory.DHDN_GK4);

    public static void main(String[] args) {
        GenerateRandomDemand grde = new GenerateRandomDemand();
        grde.run();
    }

    public GenerateRandomDemand(){
        this.scenario = ScenarioUtils.createScenario(ConfigUtils.createConfig());
    }

    public void run() {
        CommuterODInfoReader commuterODInfoReader = new CommuterODInfoReader();
        commuterODInfoReader.read();

        for(CommuterODInfo commuterODInfo : commuterODInfoReader.getCommuterODInfoList()){
            this.commuterODInfoList.add(commuterODInfo);
        }

        this.shapeMap = readShapeFile(COUNTIES, "SCH");

        for(int i = 0; i < commuterODInfoList.size(); i++){
            createOD(commuterODInfoList.get(i).getOrigin(),commuterODInfoList.get(i).getDestination()
                    ,commuterODInfoList.get(i).getNumberOfCommuters(),commuterODInfoList.get(i).getToFromPrefix());
        }

        PopulationWriter pw = new PopulationWriter(scenario.getPopulation(), scenario.getNetwork());
        pw.write(PLANSFILEOUTPUT);
    }

    public Map<String, Geometry> readShapeFile(String filename, String attrString) {
        Map<String, Geometry> shapeMap = new HashMap<String, Geometry>();
        for (SimpleFeature ft : ShapeFileReader.getAllFeatures(filename)) {
            GeometryFactory geometryFactory = new GeometryFactory();
            WKTReader wktReader = new WKTReader(geometryFactory);
            Geometry geometry;
            try {
                geometry = wktReader.read((ft.getAttribute("the_geom")).toString());
                shapeMap.put(ft.getAttribute(attrString).toString(), geometry);
            } catch (ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return shapeMap;
    }

    //create random coordinates within a given polygon
    private Coord drawRandomPointFromGeometry(Geometry g) {
        Random rnd = MatsimRandom.getLocalInstance();
        Point p;
        double x, y;
        do {
            x = g.getEnvelopeInternal().getMinX()
                    + rnd.nextDouble() * (g.getEnvelopeInternal().getMaxX() - g.getEnvelopeInternal().getMinX());
            y = g.getEnvelopeInternal().getMinY()
                    + rnd.nextDouble() * (g.getEnvelopeInternal().getMaxY() - g.getEnvelopeInternal().getMinY());
            p = MGC.xy2Point(x, y);
        } while (!g.contains(p));
        Coord coord = new Coord(p.getX(), p.getY());
        return coord;
    }

    public void createOD(String origin, String destination, int numberOfCommuter, String toFromPrefix) {
        double shareOfcar = 0.6;
        double commuters = numberOfCommuter * SCALEFACTOR;
        double carCommuters = commuters * shareOfcar;
        Geometry home = this.shapeMap.get(origin);
        Geometry work = this.shapeMap.get(destination);

        for (int i = 0; i <= commuters; i++) {
            // Specify the transportation mode
            String mode = "car";
            if (i > carCommuters)
                mode = "pt";

            Coord homec = drawRandomPointFromGeometry(home);
            homec = transformation.transform(homec);
            Coord workc = drawRandomPointFromGeometry(work);
            workc = transformation.transform(workc);

            createOnePerson(i, homec, workc, mode, toFromPrefix);
        }
    }

    public void createOnePerson ( int i, Coord coordHome, Coord coordWork, String mode, String toFromPrefix ){
        double minuteOffset = Math.random() * 60;
        Id<Person> personId = Id.createPersonId(toFromPrefix + " "+ i);
        Person person = scenario.getPopulation().getFactory().createPerson(personId);

        //Create plan
        Plan plan = scenario.getPopulation().getFactory().createPlan();
        //Create and add home activity
        Activity homeActivity = scenario.getPopulation().getFactory().createActivityFromCoord("home", coordHome);
        homeActivity.setEndTime(9 * 60 * 60 + minuteOffset * 60);
        plan.addActivity(homeActivity);
        //Create and add trip leg by car
        Leg leg2Work = scenario.getPopulation().getFactory().createLeg(mode);
        plan.addLeg(leg2Work);

        //Create and add work activity
        Activity workActivity = scenario.getPopulation().getFactory().createActivityFromCoord("work", coordWork);
        workActivity.setEndTime(17 * 60 * 60 + minuteOffset * 60);
        plan.addActivity(workActivity);
        //Create and add trip leg by car
        Leg leg2Home = scenario.getPopulation().getFactory().createLeg(mode);
        plan.addLeg(leg2Home);

        Activity homeActivity2 = scenario.getPopulation().getFactory().createActivityFromCoord("home", coordHome);
        plan.addActivity(homeActivity2);

        //Add plan to person
        person.addPlan(plan);
        scenario.getPopulation().addPerson(person);

        }
    }

