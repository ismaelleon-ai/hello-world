package com.campusdual.abstactclass;

public class Cat extends Animal{
    public Cat() {
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    public void climbing(){
        System.out.println("Get out here!");
    }
}
