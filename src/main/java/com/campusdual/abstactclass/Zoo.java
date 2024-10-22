package com.campusdual.abstactclass;

public class Zoo {
    public static void main (String[] args) {
        Cat c= new Cat (animalName: "Cat");
         Fox f= new Fox (animalName: "Fox");
         AngoraCat ac=new AngoraCat(animalName: "Angora Cat");

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

