package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class VehicleManagerImpl implements VehicleManager {

    public VehicleManagerImpl() {

    }

//    public VehicleManagerImpl(ArrayList<Vehicle> vehicles) {
//        this.vehiclesList = vehicles;
//    }


    private ArrayList<Vehicle> vehiclesList = new ArrayList<>();

    public ArrayList<Vehicle> getVehicles() {
        return vehiclesList;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehiclesList = vehicles;
    }

    @Override
    public void addVehicle() {

    }

    @Override
    public void addVehicle(Vehicle vehicle) {
        vehiclesList.add(vehicle);
    }


    @Override
    public void searchVehicle() {

    }

    @Override
    public void printAllVehicle() {

        if (vehiclesList.isEmpty()) {
            System.out.println("There is no vehicles currently.");
        } else {
            System.out.println("All vehicles in the fleet: ");
            for (Vehicle oneVehicle : vehiclesList) {
                if (oneVehicle instanceof Car) {
                    System.out.println("Car {make=" + oneVehicle.getBrand() + ", model=" + oneVehicle.getModel());
                } else {
                    System.out.println("Truck {make=" + oneVehicle.getBrand() + ", model=" + oneVehicle.getModel());
                }
            }
        }
    }

//    @Override
//    public void printAllVehicle(ArrayList<Vehicle>  vehicles) {
//        for (Vehicle oneVehicle : vehicles) {
//            System.out.println(oneVehicle.getBrand() + " " + oneVehicle.getModel());
//        }
//    }

    @Override
    public void removeVehicle() {
        System.out.println("Delete vehicle");
        System.out.println("Enter VIN of vehicle to delete: ");
        Scanner scanner = new Scanner(System.in);
        String vinNumberToDelete = scanner.nextLine();

        Iterator<Vehicle> iterator = vehiclesList.iterator();
        while (iterator.hasNext()) {
            Vehicle element = iterator.next();
            if (element.getVin().equals(vinNumberToDelete)) {
                iterator.remove();
                System.out.println("Vehicle with VIN " + element.getVin() + " deleted successfully.");
            }
        }
//        vehicles.removeIf(t -> t.getVin().equals(vinNumberToDelete));
    }

}
