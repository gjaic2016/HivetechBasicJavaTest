package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int selection;
        Scanner scanner = new Scanner(System.in);

        VehicleManagerImpl newVehicleManagerImpl = new VehicleManagerImpl();

        testData(newVehicleManagerImpl);

        do {
            menu();

            selection = scanner.nextInt();
            scanner.nextLine();
            switch (selection) {
                case 1: {
                    System.out.println("Enter 'car' or 'truck': ");
                    String choice = scanner.nextLine();
                    if (choice.equals("car")) {
                        Car newCar = new Car();
                        newVehicleManagerImpl.addVehicle(newCar);
                        break;
                    } else if (choice.equals("truck")) {
                        Truck newTruck = new Truck();
                        newVehicleManagerImpl.addVehicle(newTruck);
                        break;
                    } else {
                        System.out.println("Wrong expression. Try again!");
                        break;
                    }
                }
                case 2: {
                    newVehicleManagerImpl.searchVehicle();
                    break;
                }
                case 3: {
                    newVehicleManagerImpl.printAllVehicle();
                    break;
                }
                case 4: {
                    newVehicleManagerImpl.removeVehicle();
                    break;
                }
                case 5: {
                    System.out.println("Goodbye");
                }
            }
        } while (selection != 5);

    }

    static void menu(){
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

    static void testData(VehicleManagerImpl newVehicleManagerImpl){
        Car car1= new Car("Toyota","Yaris","1999","1111","blue", "diesel", "5", "hatchback");
        Car car2= new Car("BMW","E55","2000","2222","blue", "petrol", "5", "minivan");
        Car car3= new Car("Skoda","Fabia","2001","3333","blue", "petrol", "4", "limosine");
        Car car4= new Car("Skoda","Octavia","2005","4444","silver", "petrol", "4", "limosine");
        Car car5= new Car("Audi","A3","2005","5555","black", "petrol", "5", "hatchback");
        Car car6= new Car("Skoda","Octavia","2002","9999","white", "petrol", "5", "hatchback");
        Truck truck1 = new Truck("Audi","Q3","2010","6666","yellow", "diesel", "4100" );
        Truck truck2 = new Truck("GMC","Sierra","2001","7777","black", "diesel", "3250" );
        Truck truck3 = new Truck("GMC","Denali","2003","8888","red", "diesel", "3440" );
        newVehicleManagerImpl.addVehicle(car1);
        newVehicleManagerImpl.addVehicle(car2);
        newVehicleManagerImpl.addVehicle(car3);
        newVehicleManagerImpl.addVehicle(car4);
        newVehicleManagerImpl.addVehicle(car5);
        newVehicleManagerImpl.addVehicle(car6);
        newVehicleManagerImpl.addVehicle(truck1);
        newVehicleManagerImpl.addVehicle(truck2);
        newVehicleManagerImpl.addVehicle(truck3);

    }

}