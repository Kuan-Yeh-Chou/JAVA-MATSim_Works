package assignments.assignment4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RequestReader {
    private List<Request> requestList = new ArrayList<>();

    public List<Request> getRequestList(){
        return requestList;
    }

    public void read(){
        //Relative path
        File file = new File("src/assignments/assignment4/taxiRequests.csv");
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
            requestList.add(new Request(Integer.parseInt(lineElements[0]),
                    Integer.parseInt(lineElements[1]),
                    lineElements[2], lineElements[3]));
        }
        br.close();
    }
}
