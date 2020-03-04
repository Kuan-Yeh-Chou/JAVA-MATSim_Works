package assignments.assignment3;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.*;
import java.util.Random;

public class CarSource extends Actor {
    private Grid<Actor> grid;
    private Location location;
    final private static int DIRECTION = 90;
    private Random random = new Random(03710052);
    private int simSteps = 0;
    private int accumulatedOutflow = 0;

    public CarSource(){
        this.grid = null;
        this.location = null;
        this.setColor(Color.RED);
    }

    @Override
    public void act(){
        this.emitCar();
        accumulatedOutflow += this.getOutflow();
        if(simSteps >= 5 && simSteps % 5 == 0){
            System.out.println("Density is "+this.getDensity());
            System.out.println("Mean speed is " +this.getMeanSpeed());
            System.out.println("Outflow per step is "+(double) accumulatedOutflow/5);
            accumulatedOutflow = 0;
        }
        simSteps++;
    }

    public void emitCar(){
        Grid<Actor> gr = this.getGrid();
        Location loc = this.getLocation();
        loc=loc.getAdjacentLocation(DIRECTION);
        if(random.nextDouble() > 0.5) {
            if (gr.get(loc) == null) {
                Car car = new Car();
                car.putSelfInGrid(gr, loc);
            }
        }
    }

    public double getMeanSpeed(){
        int vehicleNumber = 0;
        int totalSpeed = 0;
        Grid<Actor> gr = this.getGrid();
        Location location = this.getLocation();
        for(int i = 1; i < gr.getNumCols(); i++){
            location = location.getAdjacentLocation(DIRECTION);
            if (gr.isValid(location)) {
                Actor neighbor = gr.get(location);
                if (neighbor instanceof Car) {
                    vehicleNumber++;
                    totalSpeed += ((Car) neighbor).getSpeed();
                }
            }
        } return ((double) totalSpeed / (vehicleNumber));
    }

    public double getDensity() {
        int vehicleNumber = 0;
        Grid<Actor> gr = this.getGrid();
        Location location = this.getLocation();
        for(int i = 1; i < gr.getNumCols(); i++){
            location = location.getAdjacentLocation(DIRECTION);
            if (gr.isValid(location)) {
                Actor neighbor = gr.get(location);
                if (neighbor instanceof Car) {
                    vehicleNumber++;
                }
            }
        } return ((double) vehicleNumber / (gr.getNumCols() - 1));
    }

    public double getOutflow(){
        int outflow = 0;
        int distanceToOutflow = 0;
        Grid<Actor> gr = this.getGrid();
        Location location = this.getLocation();
        //Set location to the end of the grid to detect outflow
        for (int i = 1; i < gr.getNumCols(); i++){
            location = location.getAdjacentLocation(DIRECTION);
        }

        for(int i = 1; i < gr.getNumCols(); i++){
            if (gr.isValid(location)) {
                Actor neighbor = gr.get(location);
                if(neighbor instanceof Car) {
                    if (((Car) neighbor).getSpeed() >= distanceToOutflow) {
                        outflow++;
                    } else {break;}
                }
            }
            location = location.getAdjacentLocation(Location.LEFT);
            distanceToOutflow++;
        } return outflow;
    }
}
