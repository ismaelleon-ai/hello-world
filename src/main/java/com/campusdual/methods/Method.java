package com.campusdual.methods;

public class Method {

    public static int arithmeticOperators(){

        int value = 5;                     // 5
        value = value + 3;                 // 8
        value = 2 - value;                 // -6
        value += 3;                        // -3
        value -= 1;                        // -4
        value *= 4;                        // -16
        value = (value - 2) / 2;           // -9
        int newValue = 3;                  // 3
        int myValue = 2;                   // 2
        value = newValue + myValue;        // 5
        final int CONST = 2;               // 2
        value = CONST;                     // 2
        value += 3;                        // 5
        value = value % 2;                 // 1
        value++;                           // 2
        value--;                           // 1
        return value;         // 1

    }

    public static void logic(){
        System.out.println("4 is equal to 4: " + (4==4));
        System.out.println("3 is different from 4: " + (3!=4));
        System.out.println("3 is greater than 5: " + (3>5));
        System.out.println("5 is less or equal than 5 " + (5<=5));
        System.out.println("Unique true combination for AND: " + (true && true));
        System.out.println("Unique false combination for OR: " + (false || false));
        System.out.println("NOT false: " + (!false));

    }

    public static String myCustomMessage(String customName){
        return "Hi " + customName + "! This is your custom message";
    }

    public static void main(String[] args) {
        logic();
        int arithResult = arithmeticOperators();
        System.out.println("Arithmetic result: " + arithResult);
        String name = "Brais";
        String message = myCustomMessage(name);
        System.out.println(message);
        System.out.println(myCustomMessage("Nerea"));

    }
}

//WIP:  Work in progress

