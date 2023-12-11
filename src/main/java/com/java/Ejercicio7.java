package com.java;

public class Ejercicio7 {

    public static void ejercicio7_1() {

        System.out.println("\n\033[46m" + "Ejercicio 7" + "\033[0m");
        System.out.println("");
        System.out.println("\033[46m" + "Ejercicio sobre operadores logicos: " + "\033[0m");
        System.out.println("\n\033[46m" + "Ejercicio 7_1" + "\033[0m");


        // Declaración de variables booleanas
        boolean X = true, Y = false, Z = true;

        // a) (X && Y) || (X && Z)
        System.out.println("a) " + ((X && Y) || (X && Z)));

        // b) (X || !Y) && (!X || Z)
        System.out.println("b) " + ((X || !Y) && (!X || Z)));

        // c) X || Y && Z
        System.out.println("c) " + (X || Y && Z));

        // d) !(X || Y) && Z
        System.out.println("d) " + (!(X || Y) && Z));

        // e) X || Y || X && !Z && !Y
        System.out.println("e) " + (X || Y || X && !Z && !Y));

        // f) !X || !Y || Z && X && !Y
        System.out.println("f) " + (!X || !Y || Z && X && !Y));
    }

    public static void ejercicio7_2() {

        System.out.println("\n\033[46m" + "Ejercicio 7_2" + "\033[0m");
         // Declaración de variables booleanas
         boolean W = false, X = true, Y = true, Z = false;

         // a) W || Y && X && W || Z
         System.out.println("a) " + (W || Y && X && W || Z));
 
         // b) X && !Y && !X || !W && Y
         System.out.println("b) " + (X && !Y && !X || !W && Y));
 
         // c) !(W || !Y) && X || Z
         System.out.println("c) " + (!(W || !Y) && X || Z));
 
         // d) X && Y && W || Z || X
         System.out.println("d) " + (X && Y && W || Z || X));
 
         // e) Y || !(Y || Z && W)
         System.out.println("e) " + (Y || !(Y || Z && W)));
 
         // f) !X && Y && (!Z || !X)
         System.out.println("f) " + (!X && Y && (!Z || !X)));
    }
    
}
