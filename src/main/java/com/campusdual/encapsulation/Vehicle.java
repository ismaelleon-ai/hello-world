package com.campusdual.encapsulation;

public class Vehicle {
    // Definamos atributos, como: marca, modelo, matrícula, disponibilidad para alquilar y velocidad maxima legal
    private String brand;
    private String model;
    private String licensePlate;
    private boolean available;
    // ctrl + shit + U para pasar a mayusculas
    public static final int LEGAL_MAX_SPEED = 120;

    // Alt + insert para generar constructor
    public Vehicle(String brand, String model, String licensePlate) {
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
        this.available = true;
    }

    public String getLicensePlate(){
        return this.licensePlate;
    }

    public void setLicensePlate(String licensePlate){
        this.licensePlate = licensePlate;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isAvailable() {
        return this.available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void rentACar(){
        if (this.available){
            this.available = false;
            System.out.println("The vehicle with license plate " + this.licensePlate + " has been rented.");
        } else {
            System.out.println("The vehicle with license plate " + this.licensePlate + " is not available");
        }
    }

    public void returnACar(){
        if(!this.available){
            this.available = true;
            System.out.println("This vehicle  with license plate " + this.licensePlate + " has been returned.");
        } else {
            System.out.println("The vehicle with license plate " + this.licensePlate + " is already available");
        }
    }

    public String getDetails(){
        return this.brand + " " + this.model + "\n\t License plate: " + this.licensePlate + "\n\t Available: " + (this.available ? "Yes " : "No");
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle("Citroën", "Xsara", "00000B");
        System.out.println(v.getDetails());
        v.rentACar();
        System.out.println(v.getDetails());
        v.returnACar();
        System.out.println(v.getDetails());
    }


}
