package assignments.assignment4;

public class Request implements Comparable<Request>{

    private int requestOrder;
    private int requestTaxiId;
    private String originCompanyId;
    private String destinationCompanyId;

    public Request (int requestOrder, int requestTaxiId, String originCompanyId, String destinationCompanyId){
        this.requestOrder = requestOrder;
        this.requestTaxiId = requestTaxiId;
        this.originCompanyId = originCompanyId;
        this.destinationCompanyId = destinationCompanyId;
    }

    @Override
    public String toString() {
        return String.join(",",
                String.valueOf(requestOrder), String.valueOf(requestTaxiId),
                originCompanyId, destinationCompanyId);
    }

    public int getRequestTaxiId(){
        return this.requestTaxiId;
    }
    public int getRequestOrderId(){
        return this.requestOrder;
    }
    public String getOriginCompanyId(){return this.originCompanyId;};
    public String getDestinationCompanyId(){return this.destinationCompanyId;};

    @Override
    public int compareTo(Request request) {
        int compareOrder=(request).getRequestOrderId();
        //For Ascending order
        return Integer.compare(getRequestOrderId(),compareOrder);
    }
}
