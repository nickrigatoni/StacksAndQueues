public class Package_Rigatti {
    private int weight;
    private String destinationArea;
    private String destinationAddress;
    private String status;

    public Package_Rigatti(int weight, String destinationArea, String destinationAddress){
        this.weight = weight;
        this.destinationArea = destinationArea;
        this.destinationAddress = destinationAddress;
        status = "undelivered";
    }

    public int getWeight(){
        return weight;
    }

    public String getDestinationArea(){
        return destinationArea;
    }

    public String getDestinationAddress(){
        return destinationAddress;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }
}
