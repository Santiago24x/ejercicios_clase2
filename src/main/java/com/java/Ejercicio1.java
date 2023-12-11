package com.java;

import java.text.DecimalFormat;

public class Ejercicio1 {
    
    public static void ejercicio1() {
        
//Convertir expresiones algebraicas en expresiones algorítmicas: 
        System.out.println("\033[46m" + "Ejercicio 1" + "\033[0m");
        System.out.println("");
        System.out.println("\033[46m" + "Convertir expresiones algebraicas en expresiones algorítmicas: " + "\033[0m");
        
 // Definición de variables
        int a = 2, b = 3, c = 4, d = 5, e = 6, f = 7, g = 8, h = 9, j = 10, m = 11, n = 12, p = 13, q = 14, r = 15, s = 16, x = 17;
        double y = 1.5; // Agregamos la variable y

        // Crear un formato para limitar a dos decimales
        DecimalFormat formatoDecimal = new DecimalFormat("#.##");

        // a) 3/2+4/3
        double resultadoA = 3 / 2 + 4 / 3;
        System.out.println("a) Resultado: " + formatoDecimal.format(resultadoA));

        // b) 1/(x-5)-3*x*y/4
        double resultadoB = 1 / (x - 5) - 3 * x * y / 4;
        System.out.println("b) Resultado: " + formatoDecimal.format(resultadoB));

        // c) 1/2+7
        double resultadoC = 1 / 2 + 7;
        System.out.println("c) Resultado: " + formatoDecimal.format(resultadoC));

        // d) 7+1/2
        double resultadoD = 7 + 1 / 2;
        System.out.println("d) Resultado: " + formatoDecimal.format(resultadoD));

        // e) a*a/(b-c)+(d-e)/(f-g*h/j)
        double resultadoE = (a * a) / (b - c) + (d - e) / (f - g * h / (double) j);
        System.out.println("e) Resultado: " + formatoDecimal.format(resultadoE));

        // f) m/n+p
        double resultadoF = m / (double) n + p;
        System.out.println("f) Resultado: " + formatoDecimal.format(resultadoF));

        // g) m+n/(p-q)
        double resultadoG = m + n /  (p - q);
        System.out.println("g) Resultado: " + formatoDecimal.format(resultadoG));

        // h) a*a/(b*b)+c*c/(d*d)
        double resultadoH = (a * a) / (b * b) + (c * c) / (d * d);
        System.out.println("h) Resultado: " + formatoDecimal.format(resultadoH));

        // i) (m+n/p)/(q-r/s)
        double resultadoI = (m + n / (double) p) / (q - r / (double) s);
        System.out.println("i) Resultado: " + formatoDecimal.format(resultadoI));

        // j) (3*a+b)/(c-(d+5*e)/(f+g/(2*h)))
        double resultadoJ = (3 * a + b) / (c - (d + 5 * e) / (f + g / (2.0 * h)));
        System.out.println("j) Resultado: " + formatoDecimal.format(resultadoJ));

        // k) (a*a+2*a*b+b*b)/(1/(x*x))+2
        double resultadoK = (a * a + 2 * a * b + b * b) / (1.0 / (x * x)) + 2;
        System.out.println("k) Resultado: " + formatoDecimal.format(resultadoK));
   
        
    }
}
