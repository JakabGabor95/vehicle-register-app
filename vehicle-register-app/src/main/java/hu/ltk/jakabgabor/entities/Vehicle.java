package hu.ltk.jakabgabor.entities;

import hu.ltk.jakabgabor.enums.VehicleType;

public class Vehicle {
    private String registrationNumber;
    private String make;
    private String model;
    private int numberOfSeats;
    private VehicleType vehicleType;

    public Vehicle(String registrationNumber, String make, String model, int numberOfSeats, VehicleType vehicleType) {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfSeats = numberOfSeats;
        this.vehicleType = vehicleType;
    }

    public Vehicle() {}

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "registrationNumber='" + registrationNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", vehicleType=" + vehicleType +
                '}';
    }
}
