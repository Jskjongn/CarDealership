package com.pluralsight;

import java.util.ArrayList;

public class Dealership {

    // properties of a dealership
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    // constructor
    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        inventory = new ArrayList<>();
    }

    // ------------------------------------------------------------------------

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // ------------------------------------------------------------------------

    // derived getters
    public ArrayList<Vehicle> getVehiclesByPrice(double min, double max){

        return null;
    }

    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model){

        return null;
    }

    public ArrayList<Vehicle> getVehiclesByYear(int min, int max){

        return null;
    }

    public ArrayList<Vehicle> getVehiclesByColor(String color){

        return null;
    }

    public ArrayList<Vehicle> getVehiclesByMileage(int min, int max){

        return null;
    }

    public ArrayList<Vehicle> getVehiclesByType(String vehicleType){

        return null;
    }

    public ArrayList<Vehicle> getAllVehicles(){
        return inventory;
    }

    // ------------------------------------------------------------------------

    // other methods
    public void addVehicle(Vehicle vehicle){
        inventory.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle){

    }
}
