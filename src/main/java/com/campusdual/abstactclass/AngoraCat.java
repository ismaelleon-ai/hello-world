package com.campusdual.abstactclass;

public class AngoraCat extends Cat {

    public AngoraCat(String animalName) {
        super(animalName);
    }

    @Override
    public void makeSound() {
        super.makeSound();
    }

    @Override
    public void climbing() {
        System.out.println("Sooo cute");

    }
}