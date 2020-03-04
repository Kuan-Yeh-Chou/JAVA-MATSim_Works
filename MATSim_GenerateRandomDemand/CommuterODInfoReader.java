package org.matsim.session5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CommuterODInfoReader {
    private List<CommuterODInfo> commuterODInfoList = new ArrayList<>();

    public List<CommuterODInfo> getCommuterODInfoList(){
        return commuterODInfoList;
    }

    public void read(){

        File file = new File("D:\\TUM\\TS\\Semester 4\\MATSim\\session_5\\session5_Data\\commuter_statistics.csv");
        System.out.println("Reading input data.");

        try {
            readFile(file);
        } catch (IOException e) {
            System.err.println("Provided file (via argument): " + file + " not found.");
            System.exit(-1);
        }
    }

    public void readFile(File fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;
        boolean firstLine = true;
        while ((line = br.readLine()) != null) {
            if (firstLine) {
                firstLine = false;
                continue;
            }
            String[] lineElements = line.split("[;,]+");
            commuterODInfoList.add(new CommuterODInfo(lineElements[0],lineElements[1],
                    lineElements[2], lineElements[3],Integer.parseInt(lineElements[4])));
        }
        br.close();
    }

}
