import java.util.Stack;
public class Truck_Rigatti {
    private int maxPackages;
    private int maxWeight;
    private String truckArea;
    private int numPackages;
    private int totalWeight;
    private String location;
    private Stack<Package_Rigatti> stack = new Stack<Package_Rigatti>();
    private TruckFleet_Rigatti thing;

    public Truck_Rigatti(int maxPackages, int totalWeight, String truckArea, String location){
        this.maxPackages = maxPackages;
        this.totalWeight = totalWeight;
        this.truckArea = truckArea;
        this.location = location;
    }

    public int getNumPackages(){
        return numPackages;
    }

    public String getTruckArea(){
        return truckArea;
    }

    public int getTotalWeight(){
        return totalWeight;
    }

    public String getLocation(){
        return location;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public String getNextLocation(){
        if (stack.isEmpty()){
            return "Warehouse";
        }
        return stack.peek().getDestinationAddress();
    }

    public void loadPackage(Package_Rigatti pack){
        if (getNumPackages() < maxPackages && totalWeight < maxWeight) {
            stack.push(pack);
            numPackages++;
            totalWeight += pack.getWeight();
        }
        else{
            System.out.println("Truck already has maximum amount of packages, cannot load package.");
            deliverPackage();
        }
    }

    public void deliverPackage(){
        if (!stack.isEmpty()){
            location = getNextLocation();
            unloadPackage();
        }
    }

    public void unloadPackage(){
        Package_Rigatti pack = stack.pop();
        numPackages--;
        totalWeight -= pack.getWeight();
        thing.packageDelivered(pack);
    }
}
