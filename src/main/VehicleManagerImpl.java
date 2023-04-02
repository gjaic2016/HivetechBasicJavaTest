package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * <h2>VehicleManagerImpl class</h2>
 *
 * Contains methods for managing vehicles such as: adding vehicles,
 * searching for vehicles, listing all vehicles and removing vehicles from fleet.
 *
 * VehicleManagerImpl class implements VehicleManager interface
 *
 */
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

    /**
     * <h3>addVehicle method</h3>
     *
     * Method adds already created vehicles to the fleet
     * If contains duplicate vehicle by VIN number, raises error with DuplicateVehicleException
     *
     * @param vehicle
     * @throws DuplicateVehicleException
     *
     */
    @Override
    public void addVehicle(Vehicle vehicle) throws DuplicateVehicleException {
        for (Vehicle oneVehicle : vehiclesList) {
            if (vehicle.getVin().equals(oneVehicle.getVin()))
                throw new DuplicateVehicleException("Vehicle with than VIN already exists: "
                        + oneVehicle.getBrand() + ", "
                        + oneVehicle.getModel() + ", "
                        + oneVehicle.getVin());
        }
        vehiclesList.add(vehicle);
    }


    /**
     * <h3>searchVehicle method</h3>
     *
     * Method searches vehicles in the fleet by make or model
     *
     */
    @Override
    public void searchVehicle(){

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
                if (searchMake.equalsIgnoreCase(oneVehicle.getBrand())) {
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
                if (searchModel.equalsIgnoreCase(oneVehicle.getModel())) {
                    System.out.println(oneVehicle.getBrand()
                            + " " + oneVehicle.getModel()
                            + ", production year: " + oneVehicle.getProductionYear()
                            + ", VIN number: " + oneVehicle.getVin()
                            + ", color: " + oneVehicle.getColor()
                    );
                } else {
                    System.out.println("No such vehicle.");
                }
            }
        } else {
            System.out.println("Wrong selection, please try again.");
        }
    }

    /**
     * <h3>printAllVehicle method</h3>
     *
     * Method prints all existing vehicles in the fleet
     *
     */
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
                    System.out.println("Truck => make: " + oneVehicle.getBrand()
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

    /**
     * <h3>removeVehicle method</h3>
     *
     * Method removes vehicle from the fleet by VIN number
     * If there is no vehicle by given VIN number, raises error with NoSuchVehicleException
     *
     * @throws NoSuchVehicleException
     *
     */
    @Override
    public void removeVehicle() throws NoSuchVehicleException {
        System.out.println("Delete vehicle");
        System.out.println("Enter VIN of vehicle to delete: ");
        Scanner scanner = new Scanner(System.in);
        String vinNumberToDelete = scanner.nextLine();

        Iterator<Vehicle> iterator = vehiclesList.iterator();
        while (iterator.hasNext()) {
            Vehicle element = iterator.next();
            if (element.getVin().equals(vinNumberToDelete)) {
                iterator.remove();
                System.out.println("Vehicle" + element.getBrand() + ", " + element.getModel()
                        + "," + element.getProductionYear() + " with VIN " + element.getVin() + " deleted successfully.");
            } else {
                throw new NoSuchVehicleException("There is no such vehicle to delete!.");
            }
        }

    }

}
