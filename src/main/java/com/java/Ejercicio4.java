package com.java;

public class Ejercicio4 {
    
    public static void ejercicio4_1() {
        
        System.out.println("\n\033[46m" + "Ejercicio 4" + "\033[0m");
        System.out.println("");
        System.out.println("\033[46m" + "Ejercicios con el operador ternario: " + "\033[0m");
        System.out.println("\n\033[46m" + "Ejercicio 4_1" + "\033[0m");

        // Declaraciones y asignaciones iniciales de variables
         int i = 8, j = 5, k;
         float x = 0.005F, y = -0.01F, z;
         char a, b = 'p', c = 'q';
 
        // Evaluacion de expresiones ternarias
         k = (j == 5) ? i : j;                       
         System.out.println("a) k = " + k);
 
         k = (j > 5) ? i : j;                        
         System.out.println("b) k = " + k);
 
         z = (x >= 0) ? x : 0;                       
         System.out.println("c) z = " + z);
 
         z = (y >= 0) ? y : 0;                      
         System.out.println("d) z = " + z);
 
         a = (b < c) ? b : c;                        
         System.out.println("e) a = " + a);
 
         k = (j > 0) ? j : 0;                        
         System.out.println("f) k = " + k);
 
         k = (i > 0 && j > 0) ? 0 : 1;             
         System.out.println("g) k = " + k);
 
         k = (y > 0 || x > 0) ? i + 1 : i - 1;       
         System.out.println("h) k = " + k);
 
         a = (b < 'c') ? b : c;                     
         System.out.println("i) a = " + a);
 
         a = (b >= c) ? b : 'r';                     
         System.out.println("j) a = " + a);
    }

    public static void ejercicio4_2() {

        System.out.println("\n\033[46m" + "Ejercicio 4_2" + "\033[0m");

        // Declaraciones y asignaciones iniciales de variables
        int i = 1, j = 1, k = 1, x;

        // Evaluación de expresiones
        x = (j >= 0 && k > 1) ? ++j : k + 1;               
        System.out.println("a) x = " + x);

        x = (j > 1 || k >= 1) ? j + 3 : k + 1;             
        System.out.println("b) x = " + x);

        x = (j >= 1 && i <= 1) ? 10 : 20;                   
        System.out.println("c) x = " + x);

        x = (i + j > 2 || k < 1) ? 2 : 4;                   
        System.out.println("d) x = " + x);

        x = (3 / 2 > i) ? j + 5 : k;                        
        System.out.println("e) x = " + x);

        x = (3 % 2 > i) ? j++ : ++k;                        
        System.out.println("f) x = " + x);

        x = (i + 10 <= j + 10 || k == 0) ? -1 : -2;        
        System.out.println("g) x = " + x);

        x = (i == 0 || j == 1 || k == 2) ? 0 : 5;          
        System.out.println("h) x = " + x);

        x = (i == 0 || j == 1 && k == 2) ? 0 : 5;          
        System.out.println("i) x = " + x);

        x = (i != 0 || j == 1 && k == 2) ? 0 : 5;          
        System.out.println("j) x = " + x);
    }
}
