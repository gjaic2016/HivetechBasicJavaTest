package main;

/**
 * <h2>DuplicateVehicleException class</h2>
 *
 * @throws DuplicateVehicleException Raised when duplicate is found by VIN number that already exists in vehicle fleet when creating new vehicle.
 * @exception Exception
 */
public class DuplicateVehicleException extends Exception {

    public DuplicateVehicleException(String message){
        super(message);
    }
}
