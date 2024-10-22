package com.campusdual.abstactclass;

public abstract class Animal {
    public String animalName;

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }
    public void sleep(){
        System.out.println(this.animalName+ "is sleeping.");
    }
    public void wakeUp(){
        System.out.println(this.animalName+ "is awake.");
    }
    public abstract void makeSound();

}

