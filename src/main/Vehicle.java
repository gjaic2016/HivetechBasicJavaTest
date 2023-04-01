package main;


/**
 * <h2>Vehicle abstract class</h2>
 *
 * Contains boilerplate model for all types of created vehicles (car, truck, ...)
 * Type specific parameters: brand, model, productionYear, vin, color, fuelType
 *
 */
public abstract class Vehicle {

    private String brand;
    private String model;
    private String productionYear;
    private String vin;
    private String color;
    private String fuelType;

    public Vehicle(String brand, String model, String productionYear, String vin, String color, String fuelType) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.vin = vin;
        this.color = color;
        this.fuelType = fuelType;
    }

    public Vehicle(){}

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(String productionYear) {
        this.productionYear = productionYear;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
