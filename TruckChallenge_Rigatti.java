public class TruckChallenge_Rigatti{
    public static void main(String[] args){
        TruckFleet_Rigatti warehouse = new TruckFleet_Rigatti();
        Truck_Rigatti truck1 = new Truck_Rigatti(15, 200, "Freehold", "Warehouse");
        Truck_Rigatti truck2 = new Truck_Rigatti(7, 100, "Manalapan", "Warehouse");
        Truck_Rigatti truck3 = new Truck_Rigatti(2, 75, "Colts Neck", "Warehouse");
        Truck_Rigatti truck4 = new Truck_Rigatti(25, 300, "Howell", "Warehouse");
        Truck_Rigatti truck5 = new Truck_Rigatti(21, 250, "Marlboro", "Warehouse");
        warehouse.addTruck(truck1);
        warehouse.addTruck(truck2);
        warehouse.addTruck(truck3);
        warehouse.addTruck(truck4);
        warehouse.addTruck(truck5);

        Package_Rigatti package1 = new Package_Rigatti(20, "Manalapan", "101 Road St");
        Package_Rigatti package2 = new Package_Rigatti(100, "Manalapan", "300 Street Rd");
        Package_Rigatti package3 = new Package_Rigatti(150, "Freehold", "132 Avenue Rd");
        Package_Rigatti package4 = new Package_Rigatti(10, "Freehold", "1 Main St");
        Package_Rigatti package5 = new Package_Rigatti(15, "Freehold", "15 Temple Rd");
        Package_Rigatti package6 = new Package_Rigatti(16, "Freehold", "3 My Rd");
        Package_Rigatti package7 = new Package_Rigatti(1, "Marlboro", "4 Goldstein Way");
        Package_Rigatti package8 = new Package_Rigatti(15, "Marlboro", "15 Goldstein Way");
        Package_Rigatti package9 = new Package_Rigatti(35, "Freehold", "53 CompSci Ct");
        Package_Rigatti package10 = new Package_Rigatti(54, "Marlboro", "32 ColtsNeck Rd");

        warehouse.addPackage(package1);
        warehouse.addPackage(package2);
        warehouse.addPackage(package3);
        warehouse.addPackage(package4);
        warehouse.addPackage(package5);
        warehouse.addPackage(package6);;
        warehouse.addPackage(package7);
        warehouse.addPackage(package8);
        warehouse.addPackage(package9);
        warehouse.addPackage(package10);

        warehouse.test();

        System.out.println(truck1.getNextLocation());
        System.out.println(truck2.getNextLocation());
        System.out.println(truck3.getNextLocation());
        System.out.println(truck4.getNextLocation());
        System.out.println(truck5.getNextLocation());

        warehouse.packageDelivered(package1);
        warehouse.packageDelivered(package2);
        warehouse.packageDelivered(package3);
        warehouse.packageDelivered(package4);
        warehouse.packageDelivered(package5);
        warehouse.packageDelivered(package6);
        warehouse.packageDelivered(package7);
        warehouse.packageDelivered(package8);
        warehouse.packageDelivered(package9);
        warehouse.packageDelivered(package10);
        warehouse.test();

        warehouse.returnAll();
        warehouse.test();

        System.out.println(package1.getStatus());
        System.out.println(package2.getStatus());
        System.out.println(package3.getStatus());
        System.out.println(package4.getStatus());
        System.out.println(package5.getStatus());
        System.out.println(package6.getStatus());
        System.out.println(package7.getStatus());
        System.out.println(package8.getStatus());
        System.out.println(package9.getStatus());
        System.out.println(package10.getStatus());
    }
}
