package hu.ltk.jakabgabor.interfaces;

import hu.ltk.jakabgabor.domain.Vehicle;

public interface VehicleRegisterInteractorInterface {
    void createNewVehicle(String stringJson);
    void listVehicleByRegistrationNumber(String stringJson);
}
