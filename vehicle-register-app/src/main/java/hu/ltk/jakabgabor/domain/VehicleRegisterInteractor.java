package hu.ltk.jakabgabor.domain;

import hu.ltk.jakabgabor.interfaces.PersistenceInterface;
import hu.ltk.jakabgabor.interfaces.VehicleDisplayInterface;

public class VehicleRegisterInteractor {
 private VehicleDisplayInterface vehicleDisplayInterface;
 private PersistenceInterface persistenceInterface;

    public VehicleRegisterInteractor(VehicleDisplayInterface vehicleDisplayInterface, PersistenceInterface persistenceInterface) {
        this.vehicleDisplayInterface = vehicleDisplayInterface;
        this.persistenceInterface = persistenceInterface;
    }
}
