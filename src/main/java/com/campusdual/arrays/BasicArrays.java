package com.campusdual.arrays;

public class BasicArrays {
    public static void main(String[] args) {
        int[] firstIntArray = new int[3];
        firstIntArray[0] = 15;
        firstIntArray[1] = 17;
        firstIntArray[2] = 19;

        String[] firstStringArray = {"A", "B", "C", "D"};

        System.out.println("First int array length: " + firstIntArray.length);
        System.out.println("First string array length: " + firstStringArray.length);

        System.out.println("First int array position value: " + firstIntArray[0]);
        System.out.println("First string array position value: " + firstStringArray[0]);

        //Para devolver el último valor del array
        System.out.println("Last int array position value: " + firstIntArray[firstIntArray.length-1]);
        System.out.println("Last string array position value: " + firstStringArray[firstStringArray.length-1]);

        System.out.println("Loop through first array");
        for (int i = 0; i < firstIntArray.length; i++) {
            System.out.print(firstIntArray[i] + " "); //El espacio convierte el número en cadena de texto
        }
        System.out.println(); //Para que meta otra línea al final del loop

        System.out.println("Loop through string array");
        for (int i = 0; i < firstStringArray.length; i++) {
            System.out.print(firstStringArray[i] + " "); //El espacio convierte un número en cadena de texto y lo printea en horizontal
        }

        System.out.println("\n"); //Para que meta otras líneas al final del loop

        int maxi = 3; //Numero max de filas
        int maxj = 3; //Numero max de columnas
        int value = 0; //Valor por el que empieza

        int[][] secondIntArray = new int[maxi][maxj];
        for (int i = 0; i < maxi; i++) {
            for (int j = 0; j < maxj; j++) {
                value++;
                secondIntArray[i][j]= value;
            }
        }
        for (int i = 0; i < maxi; i++) {
            for (int j = 0; j < maxj; j++) {
                System.out.print(secondIntArray[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        String[][] secondStringArray = {{"A", "B", "C", "D"}, {"E", "F", "G", "H"}, {"I", "J", "K", "L"}};
        for (int i = 0; i < secondStringArray.length; i++) {
            for (int j = 0; j < secondStringArray.length; j++) {
                System.out.print(secondStringArray[i][j] + " ");
            }
            System.out.println(); //Para que meta otras líneas al final del loop
        }



    }
}
