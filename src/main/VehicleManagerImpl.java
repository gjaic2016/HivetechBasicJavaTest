package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class VehicleManagerImpl implements VehicleManager {

    public VehicleManagerImpl() {

    }

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
        //TODO
        //add inputMismatchException
        Scanner scanner = new Scanner(System.in);
        System.out.println("How would you like to search for vehicles?");
        System.out.println("1. Search by make");
        System.out.println("2. Search by model");
        System.out.println("Enter number: ");
        int select = scanner.nextInt();
        scanner.nextLine();
        if (select == 1) {
            System.out.println("Enter vehicle make: ");
            String searchMake = scanner.nextLine();
            for (Vehicle oneVehicle : vehiclesList) {
                if (searchMake.toLowerCase().equals(oneVehicle.getBrand().toLowerCase())) {
                    System.out.println(oneVehicle.getBrand()
                            + " " + oneVehicle.getModel()
                            + ", production year: " + oneVehicle.getProductionYear()
                            + ", VIN number: " + oneVehicle.getVin()
                            + ", color: " + oneVehicle.getColor()
                    );
                }
            }
        } else if (select == 2) {
            System.out.println("Enter vehicle model: ");
            String searchModel = scanner.nextLine();
            for (Vehicle oneVehicle : vehiclesList) {
                if (searchModel.toLowerCase().equals(oneVehicle.getModel().toLowerCase())) {
                    System.out.println(oneVehicle.getBrand()
                            + " " + oneVehicle.getModel()
                            + ", production year: " + oneVehicle.getProductionYear()
                            + ", VIN number: " + oneVehicle.getVin()
                            + ", color: " + oneVehicle.getColor()
                    );
                }
            }
        } else {
            System.out.println("Wrong selection, please try again.");
        }
    }

    @Override
    public void printAllVehicle() {

        if (vehiclesList.isEmpty()) {
            System.out.println("There is no vehicles currently.");
        } else {
            System.out.println("All vehicles in the fleet: ");
            for (Vehicle oneVehicle : vehiclesList) {
                if (oneVehicle instanceof Car) {
                    System.out.println("Car => make: " + oneVehicle.getBrand()
                            + ", model: " + oneVehicle.getModel()
                            + ", production year: " + oneVehicle.getProductionYear()
                            + ", VIN number: " + oneVehicle.getVin()
                            + ", color: " + oneVehicle.getColor()
                            + ", fuel type: " + oneVehicle.getFuelType()
                            + ", door number: " + ((Car) oneVehicle).getDoorNumber()
                            + ", body type: " + ((Car) oneVehicle).getBodyType()
                    );
                } else {
                    System.out.println("Truck => make=" + oneVehicle.getBrand()
                            + ", model: " + oneVehicle.getModel()
                            + ", production year: " + oneVehicle.getProductionYear()
                            + ", VIN number: " + oneVehicle.getVin()
                            + ", color: " + oneVehicle.getColor()
                            + ", fuel type: " + oneVehicle.getFuelType()
                            + ", carry capacity: " + ((Truck) oneVehicle).getCarryCapacity()
                    );
                }
            }
        }
    }

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
