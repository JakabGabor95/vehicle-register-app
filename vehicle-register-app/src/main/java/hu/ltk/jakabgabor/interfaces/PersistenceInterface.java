package hu.ltk.jakabgabor.interfaces;

import hu.ltk.jakabgabor.entities.Vehicle;

public interface PersistenceInterface {
    void save(Vehicle vehicle);
    Vehicle getVehicleByRegistrationNumber(String registrationNumber);
}
