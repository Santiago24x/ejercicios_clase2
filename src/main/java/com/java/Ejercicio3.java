package com.java;

public class Ejercicio3 {
    
    public static void ejercicio3() {
        System.out.println("\n\033[46m" + "Ejercicio 3" + "\033[0m");
        System.out.println("");
        System.out.println("\033[46m" + "Ejercicio sobre operadores aritméticos Java: " + "\033[0m");


         // Valores dados para a, b y c
         int a = 8, b = 3, c = -5;

        
        // Evaluación y visualización de expresiones
        mostrarExpresionResultado("a + b + c", a + b + c);
        mostrarExpresionResultado("2 * b + 3 * (a - c)", 2 * b + 3 * (a - c));
        mostrarExpresionResultado("a / b", a / b);
        mostrarExpresionResultado("a % b", a % b);
        mostrarExpresionResultado("a / c", a / c);
        mostrarExpresionResultado("a % c", a % c);
        mostrarExpresionResultado("a * b / c", a * b / c);
        mostrarExpresionResultado("a * (b / c)", (int) (a * (b / (float) c))); // Necesitamos cast para evitar la división entera
        mostrarExpresionResultado("(a * c) % b", (a * c) % b);
        mostrarExpresionResultado("a * (c % b)", a * (c % b));
        mostrarExpresionResultado("(3 * a - 2 * b) % (2 * a - c)", (3 * a - 2 * b) % (2 * a - c));
        mostrarExpresionResultado("2 * (a / 5 + (4 - b * 3)) % (a + c - 2)", 2 * (a / 5 + (4 - b * 3)) % (a + c - 2));
        mostrarExpresionResultado("(a - 3 * b) % (c + 2 * a) / (a - c)", (a - 3 * b) % (c + 2 * a) / (a - c));
        mostrarExpresionResultado("a - b - c * 2", a - b - c * 2);
    }

        // Función para mostrar la expresión y el resultado
        public static void mostrarExpresionResultado(String expresion, int resultado) {
            System.out.println(expresion + "\nResultado: " + resultado + "\n ");
    }
}
