package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int selection;
        Scanner scanner = new Scanner(System.in);

        VehicleManagerImpl newVehicleManagerImpl = new VehicleManagerImpl();

        try {
            testData(newVehicleManagerImpl);
        } catch (DuplicateVehicleException e) {
            System.out.println("Error: " + e.getMessage());
        }

        do {
            menu();

            selection = scanner.nextInt();
            scanner.nextLine();
            switch (selection) {
                case 1 -> createVehicle(newVehicleManagerImpl, scanner);
                case 2 -> newVehicleManagerImpl.searchVehicle();
                case 3 -> newVehicleManagerImpl.printAllVehicle();
                case 4 -> {
                    try {
                        newVehicleManagerImpl.removeVehicle();
                    } catch (NoSuchVehicleException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }
                case 5 -> System.out.println("Goodbye");
            }
        } while (selection != 5);

    }

    static void menu() {
        System.out.println(" ");
        System.out.println("Vehicle Fleet Management System");
        System.out.println("-------------------------------");
        System.out.println("Select option");
        System.out.println("1. Add a vehicle to the fleet");
        System.out.println("2. Search for vehicles by make or model");
        System.out.println("3. Print all vehicles in the fleet");
        System.out.println("4. Delete a vehicle from the fleet");
        System.out.println("5. Quit");
    }

    static void createVehicle(VehicleManagerImpl newVehicleManagerImpl, Scanner scanner) {
        try {
            System.out.println("Enter 'car' or 'truck': ");
            String choice = scanner.nextLine();
            if (choice.equals("car")) {
                Car newCar = new Car();
                newVehicleManagerImpl.addVehicle(newCar);

            } else if (choice.equals("truck")) {
                Truck newTruck = new Truck();
                newVehicleManagerImpl.addVehicle(newTruck);

            } else {
                System.out.println("Wrong expression. Try again!");

            }
        } catch (DuplicateVehicleException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


    /**
     * Method fills vehicles data for testing purposes
     *
     * @param newVehicleManagerImpl test vehicles for Vehicle Manager
     * @throws DuplicateVehicleException Throws exception in when adding new vehicle with identical VIN number
     */
    static void testData(VehicleManagerImpl newVehicleManagerImpl) throws DuplicateVehicleException {
        newVehicleManagerImpl.addVehicle(new Car("Toyota", "Yaris", "1999", "1111", "blue", "diesel", "5", "hatchback"));
        newVehicleManagerImpl.addVehicle(new Car("BMW", "E55", "2000", "2222", "blue", "petrol", "5", "minivan"));
        newVehicleManagerImpl.addVehicle(new Car("Skoda", "Fabia", "2001", "3333", "blue", "petrol", "4", "limosine"));
        newVehicleManagerImpl.addVehicle(new Car("Skoda", "Octavia", "2005", "4444", "silver", "petrol", "4", "limosine"));
        newVehicleManagerImpl.addVehicle(new Car("Audi", "A3", "2005", "5555", "black", "petrol", "5", "hatchback"));
        newVehicleManagerImpl.addVehicle(new Car("Skoda", "Octavia", "2002", "9999", "white", "petrol", "5", "hatchback"));
        newVehicleManagerImpl.addVehicle(new Car("Yugo", "45", "1977", "9876", "blue", "petrol", "3", "hatchback"));
        newVehicleManagerImpl.addVehicle(new Car("Zastava", "750", "1955", "4321", "green", "petrol", "2", "hatchback"));
        newVehicleManagerImpl.addVehicle(new Truck("Audi", "Q3", "2010", "6666", "yellow", "diesel", "4100"));
        newVehicleManagerImpl.addVehicle(new Truck("GMC", "Sierra", "2001", "7777", "black", "diesel", "3250"));
        newVehicleManagerImpl.addVehicle(new Truck("GMC", "Denali", "2003", "8888", "red", "diesel", "3440"));
    }

}