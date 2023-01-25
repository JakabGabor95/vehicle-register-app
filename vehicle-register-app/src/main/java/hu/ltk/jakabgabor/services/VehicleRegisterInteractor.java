package hu.ltk.jakabgabor.services;

import hu.ltk.jakabgabor.entities.Vehicle;
import hu.ltk.jakabgabor.interfaces.PersistenceInterface;
import hu.ltk.jakabgabor.interfaces.VehicleDisplayInterface;
import hu.ltk.jakabgabor.interfaces.VehicleRegisterInteractorInterface;
import hu.ltk.jakabgabor.parser.VehicleParser;
import hu.ltk.jakabgabor.validators.NewVehicleValidator;

public class VehicleRegisterInteractor implements VehicleRegisterInteractorInterface {
 private VehicleDisplayInterface vehicleDisplayInterface;
 private PersistenceInterface persistenceInterface;
 private NewVehicleValidator newVehicleValidator = new NewVehicleValidator();
 private VehicleParser vehicleParser = new VehicleParser();

    public VehicleRegisterInteractor(VehicleDisplayInterface vehicleDisplayInterface,
                                     PersistenceInterface persistenceInterface) {
        this.vehicleDisplayInterface = vehicleDisplayInterface;
        this.persistenceInterface = persistenceInterface;
    }

    @Override
    public void createNewVehicle(String vehicleJson) {
        //Validator:
//        parse
//        üzleti logika
//        válasz
        Vehicle vehicle = newVehicleValidator.vehicleIsNull(vehicleJson);

        persistenceInterface.save(vehicle);
    }

    @Override
    public void getVehicleByRegistrationNumber(String registrationNumberJson) {
        String registrationNumber = newVehicleValidator.registrationNumberIsNull(registrationNumberJson);
        System.out.println(registrationNumber);
        Vehicle vehicle = persistenceInterface.getVehicleByRegistrationNumber(registrationNumber);
        System.out.println(vehicle);
        vehicleDisplayInterface.display(vehicleParser.parseVehicleToJson(vehicle));
    }
}
