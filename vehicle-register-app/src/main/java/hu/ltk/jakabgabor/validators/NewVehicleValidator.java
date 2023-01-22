package hu.ltk.jakabgabor.validators;
import hu.ltk.jakabgabor.entities.Vehicle;
import hu.ltk.jakabgabor.parser.VehicleParser;

public class NewVehicleValidator {
   private VehicleParser vehicleParser = new VehicleParser();
    public Vehicle vehicleIsNull(String vehicleJson) {
        try {
            if (vehicleParser.parseToVehicle(vehicleJson) == null) {
                throw new NullPointerException();
            }
            else{
                return vehicleParser.parseToVehicle(vehicleJson);
            }
        } catch (NullPointerException e) {
            throw new RuntimeException(e);
        }
    }

    public String registrationNumberIsNull(String registrationNumberJson) {
        try {
            if (vehicleParser.parseToRegistrationNumber(registrationNumberJson) == null) {
                throw new NullPointerException();
            }
            else{
                return vehicleParser.parseToRegistrationNumber(registrationNumberJson);
            }
        } catch (NullPointerException e) {
            throw new RuntimeException(e);
        }
    }
}
