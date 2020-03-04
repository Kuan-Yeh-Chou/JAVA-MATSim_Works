package assignments.assignment4;

import info.gridworld.grid.Location;

import java.util.ArrayList;
import java.util.List;

public interface Taxi {

    void addRequests(List<Request> requests);
    int getRequestTaxiId();
    void removeFulfilledRequest();
    void checkIfOccupied();
    void adjustColor();
    void turn();
    void move();
    boolean canMove();
    Company getNearbyCompany();
    ArrayList<Location> getLocationsInDirections(int[] directions);

}

/*

There are 4 useful points of Taxi interface. First, Taxi interface can be implemented by multiple types of Taxi that
behave similarly such as SimpleTaxi and SmartTaxi. Second, each type of Taxi can extend (override) their specific
methods based on methods in Taxi interface. Third, the standardization of methods and types in Taxi interface can be
developed by different parts or levels and can be developed in parallel. Fourth,methods and types in interface are neat
and easy to view.
For another possible strategy when managing multiple implementations, creating interfaces of each type of Taxi such as
SmartTaxi interface that extend from Taxi interface by adding new function like setDirectionToTarget(). Therefore, it
will be more efficient to manage the various types of Taxi by creating structured inheritance hierarchies of interface.

 */
