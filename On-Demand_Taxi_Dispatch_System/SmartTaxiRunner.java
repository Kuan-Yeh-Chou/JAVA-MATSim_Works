package assignments.assignment4;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.*;

public class SmartTaxiRunner {

    public static void main(String[] args) {
        ActorWorld world = new ActorWorld();

        world.add(new Location(0, 0), new Company("A", Color.RED));
        world.add(new Location(0, 9), new Company("B", Color.BLUE));
        world.add(new Location(9, 0), new Company("C", Color.YELLOW));
        world.add(new Location(9, 9), new Company("D", Color.GREEN));

        RequestReader requestReader = new RequestReader();
        requestReader.read();

        SmartTaxi smartTaxiOne = new SmartTaxi(1);
        smartTaxiOne.addRequests(requestReader.getRequestList());
        SmartTaxi smartTaxiTwo = new SmartTaxi(2);
        smartTaxiTwo.addRequests(requestReader.getRequestList());
        SmartTaxi smartTaxiThree = new SmartTaxi(3);
        smartTaxiThree.addRequests(requestReader.getRequestList());
        SmartTaxi smartTaxiFour = new SmartTaxi(4);
        smartTaxiFour.addRequests(requestReader.getRequestList());

        world.add(new Location(4, 4), smartTaxiOne);
        world.add(new Location(4, 5), smartTaxiTwo);
        world.add(new Location(5, 4), smartTaxiThree);
        world.add(new Location(5, 5), smartTaxiFour);

        world.show();
    }
}
