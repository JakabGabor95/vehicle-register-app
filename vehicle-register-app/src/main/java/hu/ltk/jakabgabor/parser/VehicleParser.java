package hu.ltk.jakabgabor.parser;

import com.google.gson.Gson;
import hu.ltk.jakabgabor.entities.Vehicle;

public class VehicleParser {
    private Gson gson = new Gson();

    public Vehicle parseToVehicle(String vehicleJson) {
        return gson.fromJson(vehicleJson, Vehicle.class);}
    public String parseToRegistrationNumber(String registrationNumberJson){return gson.fromJson(registrationNumberJson, String.class);}
    public String parseVehicleToJson(Vehicle vehicle){return gson.toJson(vehicle);}
}
