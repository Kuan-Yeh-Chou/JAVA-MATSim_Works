package org.matsim.session5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CommuterODInfo {

    private String origin;
    private String destination;
    private int numberOfCommuters;
    private String toFromPrefix;

    public CommuterODInfo (String originCounty, String origin, String destinationCounty,String destination, int numberOfCommuters){
        this.origin = origin;
        this.destination = destination;
        this.numberOfCommuters = numberOfCommuters;
        this.toFromPrefix = originCounty + " - " +destinationCounty;
    }

    public String getOrigin(){
        this.origin= String.format("%5d", Integer.valueOf(this.origin)).replace(" ", "0");
        return this.origin;
    }

    public String getDestination(){
        this.destination= String.format("%5d", Integer.valueOf(this.destination)).replace(" ", "0");
        return this.destination;
    }

    public int getNumberOfCommuters(){
        return this.numberOfCommuters;
    }

    public String getToFromPrefix(){
        return toFromPrefix;
    }


    public String toString() {
        return String.join(",",
                origin, destination,String.valueOf(numberOfCommuters),toFromPrefix);
    }

    /*
    @Override
    public int compareTo(CommuterODInfo commuterODInfo) {
        int compareOrder=(commuterODInfo).getNumberOfCommuters();
        //For Ascending order
        return Integer.compare(getNumberOfCommuters(),compareOrder);
    }

     */
}
