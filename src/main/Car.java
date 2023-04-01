package main;


import java.util.Scanner;

/**
 * <h2>Car class</h2>
 *
 * Sub class created from extended Vehicle class
 * Type specific parameters: doorNumber, bodyType
 *
 */
public class Car extends Vehicle {

    private String doorNumber;

    private String bodyType;

    public Car(String brand, String model, String productionYear, String vin, String color, String fuelType, String doorNumber, String bodyType) {
        super(brand, model, productionYear, vin, color, fuelType);
        this.doorNumber = doorNumber;
        this.bodyType = bodyType;
    }

    public Car() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter car brand: ");

        String brand = scanner.next();
        setBrand(brand);

        System.out.print("Enter car model: ");
        String model = scanner.next();
        setModel(model);

        System.out.print("Enter car year: ");
        String productionYear = scanner.next();
        setProductionYear(productionYear);

        System.out.print("Enter car VIN: ");
        String vin = scanner.next();
        setVin(vin);

        System.out.print("Enter car color: ");
        String color = scanner.next();
        setColor(color);

        System.out.print("Enter car fuel type: ");
        String fuelType = scanner.next();
        setFuelType(fuelType);

        System.out.print("Enter car number of doors: ");
        String doorNumber = scanner.next();
        setDoorNumber(doorNumber);

        System.out.print("Enter car body type: ");
        String bodyType = scanner.next();
        setBodyType(bodyType);
    }

    public String getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(String doorNumber) {
        this.doorNumber = doorNumber;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }


}
