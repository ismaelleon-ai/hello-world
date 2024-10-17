package com.campusdual.input;

import com.campusdual.Utils;

import javax.xml.namespace.QName;
import java.util.Scanner;

public class Input {


    public static void useScannerToGetName (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write your name: ");
        String name = scanner.nextLine();
        System.out.println("Hi! " + name + ", welcome back!");
    }

    public static void useUtilsToGetName(){
        String name = Utils.string("Write your name: ");
        System.out.println("Hi! " + name + ", welcome back!");

    }

    public static void main(String[] args) {
        //useScannerToGetName();
        useUtilsToGetName();
    }
}
