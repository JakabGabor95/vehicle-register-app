package hu.ltk.jakabgabor.interfaces;

import hu.ltk.jakabgabor.domain.Vehicle;

import java.util.List;

public interface PersistenceInterface {
    void save(Vehicle vehicle);
    Vehicle listVehicleByRegistrationNumber(String registrationNumber);
}
