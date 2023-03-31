package main;

import java.util.Scanner;

public class Truck extends Vehicle {

    private String carryCapacity;

    public Truck(String brand, String model, String productionYear, String vin, String color, String fuelType, String carryCapacity) {
        super(brand, model, productionYear, vin, color, fuelType);
        this.carryCapacity = carryCapacity;
    }

    public Truck() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter truck brand: ");
        String brand = scanner.next();
        setBrand(brand);

        System.out.print("Enter truck model: ");
        String model = scanner.next();
        setModel(model);

        System.out.print("Enter truck year: ");
        String productionYear = scanner.next();
        setProductionYear(productionYear);

        System.out.print("Enter truck VIN: ");
        String vin = scanner.next();
        setVin(vin);

        System.out.print("Enter truck color: ");
        String color = scanner.next();
        setColor(color);

        System.out.print("Enter truck fuel type: ");
        String fuelType = scanner.next();
        setFuelType(fuelType);

        System.out.print("Enter truck carry capacity: ");
        String carryCapacity = scanner.next();
        setCarryCapacity(carryCapacity);
    }

    public String getCarryCapacity() {
        return carryCapacity;
    }

    public void setCarryCapacity(String carryCapacity) {
        this.carryCapacity = carryCapacity;
    }

}
