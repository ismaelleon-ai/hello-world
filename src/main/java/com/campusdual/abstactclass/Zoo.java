package com.campusdual.abstactclass;

public class Zoo {
    public static void main(String[] args) {
        Cat c = new Cat ("Cat");
        Fox f = new Fox ("Fox");
        AngoraCat ac = new AngoraCat ("Angora cat");

        c.makeSound();
        f.makeSound();
        ac.makeSound();

        c.wakeUp();
        f.wakeUp();
        ac.wakeUp();

        c.climbing();
        ac.climbing();
    }
}


