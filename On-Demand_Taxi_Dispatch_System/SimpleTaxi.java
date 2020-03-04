package assignments.assignment4;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimpleTaxi extends Actor implements Taxi {
    private List<Request> taxiRequests = new ArrayList<>();
    private int requestTaxiId;
    private int step;
    private int requestListIndex;
    private boolean isOccupied;
    private boolean isGoingToAdjustColor;
    private boolean isGoingToNextOrder;
    private Location location;
    private Company nearbyCompany;


    public SimpleTaxi(int requestTaxiId){
        this.requestTaxiId = requestTaxiId;
        this.location = this.getLocation();
        this.setColor(Color.YELLOW);
        this.isOccupied = false;
        this.isGoingToAdjustColor = false;
        this.isGoingToNextOrder = false;
        this.step = 0;
        this.requestListIndex = 0;
     }

    @Override
    public void addRequests(List<Request> requests){
        for(Request request : requests) {
            if(request.getRequestTaxiId() == this.requestTaxiId){
                taxiRequests.add(request);
            }
        }
        Collections.sort(taxiRequests);
    }

    @Override
    public void removeFulfilledRequest(){
        if(isGoingToNextOrder){
            taxiRequests.remove(requestListIndex);
            this.isGoingToNextOrder = false;
        }
    }

    @Override
    public int getRequestTaxiId(){
        return this.requestTaxiId;
    }

    @Override
    public void act() {
        //assure no move or turn while changing color
        if(isGoingToAdjustColor){
            adjustColor();
            this.isGoingToAdjustColor = false;
        }else{
            if (this.canMove()) {
                this.move();
            } else {
                this.turn();
            }
        }
        this.checkIfOccupied();
        this.step++;

        if(this.requestListIndex >=taxiRequests.size()){
            this.removeSelfFromGrid();
            System.out.println("TaxiId: "+getRequestTaxiId()+ " Steps: "+ step);
        }
    }

    @Override
    public void checkIfOccupied() {
        if(this.getNearbyCompany()!=null) {
            if (!isOccupied &&(taxiRequests.get(requestListIndex).getOriginCompanyId()).equals(this.getNearbyCompany().getCompanyId())) {
                this.isOccupied = true;
                this.isGoingToAdjustColor = true;
            }else if (isOccupied &&(taxiRequests.get(requestListIndex).getDestinationCompanyId()).equals(this.getNearbyCompany().getCompanyId())) {
                this.isOccupied = false;
                this.isGoingToAdjustColor = true;
                this.isGoingToNextOrder = true;
                this.removeFulfilledRequest();
            }
       }
    }

    @Override
    public void adjustColor() {
        if(isOccupied){this.setColor(Color.RED);}
        else{this.setColor(Color.YELLOW);}
    }

    @Override
    public void turn() {
        this.setDirection(this.getDirection() + 45);
    }

    @Override
    public void move() {
        Grid<Actor> gr = this.getGrid();
        if (gr != null) {
            Location loc = this.getLocation();
            Location next = loc.getAdjacentLocation(this.getDirection());
            if (gr.isValid(next)) {
                this.moveTo(next);
            } else {
                this.removeSelfFromGrid();
            }
        }
    }

    @Override
    public boolean canMove() {
        Grid<Actor> gr = this.getGrid();
        if (gr == null) {
            return false;
        } else {
            Location loc = this.getLocation();
            Location next = loc.getAdjacentLocation(this.getDirection());
            if (!gr.isValid(next)) {
                return false;
            } else {
                Actor neighbor = gr.get(next);
                return neighbor == null;
            }
        }
    }

    @Override
    public Company getNearbyCompany() {
        int[] dirs =
                { Location.NORTH, Location.NORTHEAST, Location.EAST, Location.SOUTHEAST, Location.SOUTH,
                        Location.SOUTHWEST, Location.WEST, Location.NORTHWEST};
        for (Location loc : getLocationsInDirections(dirs)) {
            Actor actor = getGrid().get(loc);
            if (actor instanceof Company) {
                this.nearbyCompany = (Company) actor;
            }
        }return this.nearbyCompany;
    }

    @Override
    public ArrayList<Location> getLocationsInDirections(int[] directions) {
        ArrayList<Location> nearbyLocations = new ArrayList<Location>();
        Grid gr = getGrid();
        Location loc = getLocation();
        for (int d : directions) {
            Location neighborLoc = loc.getAdjacentLocation(getDirection() + d);
            if (gr.isValid(neighborLoc)) {
                nearbyLocations.add(neighborLoc);
            }
        }return nearbyLocations;
    }
}
