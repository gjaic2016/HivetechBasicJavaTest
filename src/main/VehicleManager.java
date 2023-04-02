package main;

/**
 * <h2>VehicleManager interface</h2>
 *
 * Contains boileplate methods for managing vehicles which are used in VehicleManagerImpl class
 * searching for vehicles, listing all vehicles and removing vehicles from fleet.
 *
 * VehicleManager interface is used in VehicleManagerImpl class
 *
 */
public interface VehicleManager {

    void addVehicle();

    /**
     * <h3>addVehicle method</h3>
     *
     * Method for adding vehicles to the fleet
     * If contains duplicate vehicle by VIN number, raises error with DuplicateVehicleException
     *
     * @param vehicle
     * @throws DuplicateVehicleException
     *
     */
    void addVehicle(Vehicle vehicle) throws DuplicateVehicleException;

    /**
     * <h3>searchVehicle method</h3>
     *
     * Method searches vehicles in the fleet by make or model
     *
     */
    void searchVehicle();

    /**
     * <h3>printAllVehicle method</h3>
     *
     * Method prints all existing vehicles in the fleet
     */
    void printAllVehicle();

    /**
     * <h3>removeVehicle method</h3>
     *
     * Method removes vehicle from the fleet by VIN number
     * If there is no vehicle by given VIN number, raises error with NoSuchVehicleException
     *
     * @throws NoSuchVehicleException
     *
     */
    void removeVehicle() throws NoSuchVehicleException;

}
