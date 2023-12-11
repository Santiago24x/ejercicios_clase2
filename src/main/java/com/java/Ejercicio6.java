package com.java;

public class Ejercicio6 {
    public static void ejercicio6() {

        System.out.println("\n\033[46m" + "Ejercicio 6" + "\033[0m");
        System.out.println("");
        System.out.println("\033[46m" + "Ejercicio sobre operadores relacionales: " + "\033[0m");

         // Declaración de variables
         int i = 8, j = 5;
         float x = 0.005F, y = -0.01F;
         char c = 'c', d = 'd';
 
         // a) i <= j
         System.out.println("a) " + (i <= j));
 
         // b) c > d
         System.out.println("b) " + (c > d));
 
         // c) x >= 0
         System.out.println("c) " + (x >= 0));
 
         // d) x < y--
         System.out.println("d) " + (x < y--));
 
         // e) j != 6
         System.out.println("e) " + (j != 6));
 
         // f) c == 99
         System.out.println("f) " + (c == 99));
 
         // g) !(i <= j)
         System.out.println("g) " + !(i <= j));
 
         // h) !(c == 99)
         System.out.println("h) " + !(c == 99));
 
         // i) !(x > 0)
         System.out.println("i) " + !(x > 0));
 
         // j) -j == i - 13
         System.out.println("j) " + (-j == i - 13));
 
         // k) ++x > 0
         System.out.println("k) " + (++x > 0));
 
         // l) y-- < 1
         System.out.println("l) " + (y-- < 1));
 
         // m) c > d || c > 0
         System.out.println("m) " + (c > d || c > 0));
 
         // n) 5 * (i + j) > 'c'
         System.out.println("n) " + (5 * (i + j) > 'c'));
 
         // o) 2 * x + y == 0
         System.out.println("o) " + (2 * x + y == 0));
 
        // p) 2 * x + (y == 0)
        System.out.println("p) " + "Este genera error al compilar");
 
         // q) x + y >= 0
         System.out.println("q) " + (x + y >= 0));
 
         // r) x < ++y
         System.out.println("r) " + (x < ++y));
 
         // s) - (i + j) != -i + j
         System.out.println("s) " + (- (i + j) != -i + j));
 
         // t) i <= j && i >= c
         System.out.println("t) " + (i <= j && i >= c));
 
         // u) i > 0 && j < 5
         System.out.println("u) " + (i > 0 && j < 5));
 
         // v) i > 0 || j < 5
         System.out.println("v) " + (i > 0 || j < 5));
 
         // w) x > y && i > 0 || j < 5
         System.out.println("w) " + (x > y && i > 0 || j < 5));
 
         // x) (3 * i - 2 * j) % (2 * d - c) > 3 * d
         System.out.println("x) " + ((3 * i - 2 * j) % (2 * d - c) > 3 * d));
 
         // y) 2 * ((i / 5) + (4 * (j - 3)) % (i + j - 2)) >= 10
         System.out.println("y) " + (2 * ((i / 5) + (4 * (j - 3)) % (i + j - 2)) >= 10));
 
         // z) (i - 3 * j) % (c + 2 * d) / (x - y) >= 0
         System.out.println("z) " + ((i - 3 * j) % (c + 2 * d) / (x - y) >= 0));
    

    }
    
}
