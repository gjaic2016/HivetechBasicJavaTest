package main;

import java.util.ArrayList;
import java.util.Scanner;

public interface VehicleManager {

    void addVehicle();

    void addVehicle(Vehicle vehicle);


    void searchVehicle();

    void printAllVehicle();

    default void printAllVehicle(ArrayList<Vehicle> vehicles) {

    }

    void removeVehicle();

}
