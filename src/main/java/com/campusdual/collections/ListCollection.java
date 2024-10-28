package com.campusdual.collections;

import java.util.ArrayList;
import java.util.List;

public class ListCollection {
    public static void main(String[] args) {

        List<String> instruments = new ArrayList<>();

        instruments.add("Guitar");
        instruments.add("Piano");
        instruments.add("Drums");
        instruments.add("Bass");

        for (int i = 0; i < instruments.size(); i++) {
            System.out.println("Instrument and index " + i + ": " + instruments.get(i));
        }

        //instruments.remove(instruments.get(1)); Otra forma de eliminar el piano
        instruments.remove("Piano");

        for (int i = 0; i < instruments.size(); i++) {
            System.out.println("Instrument and index " + i + ": " + instruments.get(i));
        }
        // "for each" cunde para listar, para borrar no
        for (String item : instruments) {
            System.out.println(item);
        }
    }
}
