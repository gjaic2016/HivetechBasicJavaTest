package main;


public interface VehicleManager {

    void addVehicle();

    void addVehicle(Vehicle vehicle) throws DuplicateVehicleException;


    void searchVehicle();

    void printAllVehicle();


    void removeVehicle() throws NoSuchVehicleException;

}
