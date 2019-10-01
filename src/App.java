import ar.com.ada.collision.subclass.ElectricalVehicle;
import ar.com.ada.collision.subclass.SportsVehicle;
import ar.com.ada.collision.subclass.Truck;
import ar.com.ada.collision.superclass.Vehicle;

public class App {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Peugeot", "307", 2017);
        Vehicle vehicle2 = new Vehicle("Peugeot", "207", 2014);
        Vehicle vehicle3 = new Vehicle("Peugeot", "206", 2013);
        ElectricalVehicle electricalVehicle1 = new ElectricalVehicle(302, "Nissan", "Tiida", 2016);
        ElectricalVehicle electricalVehicle2 = new ElectricalVehicle(400, "Nissan", "Tiida", 2017);
        ElectricalVehicle electricalVehicle3 = new ElectricalVehicle(500, "Nissan", "Tiida", 2019);
        SportsVehicle sportsVehicle1 = new SportsVehicle(150, "Mercedes Benz", "EQ", 2010);
        SportsVehicle sportsVehicle2 = new SportsVehicle(200, "Mercedes Benz", "EQ", 2015);
        SportsVehicle sportsVehicle3 = new SportsVehicle(300, "Mercedes Benz", "EQ", 2018);
        Truck truck1 = new Truck(70, "Toyota", "Dina", 2014);
        Truck truck2 = new Truck(90, "Toyota", "Dina", 2015);
        Truck truck3 = new Truck(120, "Toyota", "Dina", 2017);

        Vehicle array[] = {vehicle1, vehicle2, vehicle3,
                electricalVehicle1, electricalVehicle2, electricalVehicle3,
                sportsVehicle1, sportsVehicle2, sportsVehicle3,
                truck1, truck2, truck3};
        for (int i = 0 ; i < array.length ; i++) {
            System.out.println("elemento " + i + "= " + array[i].technicalSheet());
        }
    }
}
