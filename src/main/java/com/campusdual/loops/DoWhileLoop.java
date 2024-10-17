package com.campusdual.loops;

import com.campusdual.Utils;

public class DoWhileLoop {

    public static void interactiveMenu(){
        int opt;

        do{
            System.out.println("\n Interactive menu"); // aqui \n es para hacer un salto de linea
            System.out.println("1. Print \"hi\" ");  // asi te reconoce las comillas como grafía
            System.out.println("2. Print \"bye\"");
            System.out.println("3. Exit");
            opt = Utils.integer("\nChoose an option: ");
            switch (opt){
                case 1:
                    System.out.println("Hi!");
                    break;
                case 2:
                    System.out.println("Bye!");
                    break;
                case 3:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("This is not a valid option, please, choose another");
                    break;
            }
        } while (opt != 3);

    }

    public static void main(String[] args) {
        interactiveMenu();
    }
}
