package assignments.assignment4;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.*;

public class SimpleTaxiRunner {

    public static void main(String[] args) {
        ActorWorld world = new ActorWorld();

        world.add(new Location(0, 0), new Company("A", Color.RED));
        world.add(new Location(0, 9), new Company("B", Color.BLUE));
        world.add(new Location(9, 0), new Company("C", Color.YELLOW));
        world.add(new Location(9, 9), new Company("D", Color.GREEN));

        RequestReader requestReader = new RequestReader();
        requestReader.read();

        SimpleTaxi simpleTaxiOne = new SimpleTaxi(1);
        simpleTaxiOne.addRequests(requestReader.getRequestList());
        SimpleTaxi simpleTaxiTwo = new SimpleTaxi(2);
        simpleTaxiTwo.addRequests(requestReader.getRequestList());
        SimpleTaxi simpleTaxiThree = new SimpleTaxi(3);
        simpleTaxiThree.addRequests(requestReader.getRequestList());
        SimpleTaxi simpleTaxiFour = new SimpleTaxi(4);
        simpleTaxiFour.addRequests(requestReader.getRequestList());

        world.add(new Location(4, 4), simpleTaxiOne);
        world.add(new Location(4, 5), simpleTaxiTwo);
        world.add(new Location(5, 4), simpleTaxiThree);
        world.add(new Location(5, 5), simpleTaxiFour);

        world.show();
    }
}
