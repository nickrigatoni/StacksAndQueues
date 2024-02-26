import java.util.ArrayList;
import java.util.concurrent.LinkedTransferQueue;
public class TruckFleet_Rigatti {
    private ArrayList<Truck_Rigatti> fleet = new ArrayList<Truck_Rigatti>();

    public void addTruck(Truck_Rigatti truck){
        fleet.add(truck);
    }

    public void addPackage(Package_Rigatti p){
        for (int x = 0; x<fleet.size(); x++){
            if (p.getDestinationArea().equals(fleet.get(x).getTruckArea())){
                Truck_Rigatti truck = fleet.get(x);
                truck.loadPackage(p);
            }
        }
    }

    public void returnAll(){
        for (int x = 0; x<fleet.size(); x++){
            Truck_Rigatti t = fleet.get(x);
            t.setLocation("Warehouse");
        }
    }

    public void packageDelivered(Package_Rigatti pack){
        pack.setStatus("delivered");
    }

    public String test(){
        return null;
    }
}
