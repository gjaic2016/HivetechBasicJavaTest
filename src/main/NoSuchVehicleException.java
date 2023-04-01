package main;

/**
 * <h2>NoSuchVehicleException class</h2>
 *
 * @throws NoSuchVehicleException Raised when no vehicle is found by given VIN number
 * @exception Exception
 */
public class NoSuchVehicleException extends Exception{

    public NoSuchVehicleException(String message){
        super(message);
    }
}
