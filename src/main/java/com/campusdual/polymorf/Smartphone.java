package com.campusdual.polymorf;

public class Smartphone extends Device implements IChargeable{
    //La clase padre es Device, por eso se hace extends de ella

    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    public void makeACall(){
        System.out.println("Making a call");
    }

    @Override
    public void charge() {
        System.out.println(this.getBrand() + " " + this.getModel() + " " + " is charging at 15 W.");
    }

    @Override
    public void use() {
        System.out.println("Using with touch screen.");

    }
}
