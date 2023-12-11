package com.java;

public class Ejercicio2 {
    
    public static void ejercicio2() {

        System.out.println("\n\033[46m" + "Ejercicio 2" + "\033[0m");
        System.out.println("");
        System.out.println("\033[46m" + "Calcular el tipo del resultado en operaciones aritméticas: " + "\033[0m");
         // Declaración de variables
         byte b;
         short s;
         long ln;
         int i, j;
         float f;
         double d;
         char c;
 
         // Asignación de valores
         b = 1;
         s = 2;
         ln = 3L;
         i = 4;
         j = 5;
         f = 6.0f;
         d = 7.0;
         c = 'A';
 
         // Comprobación de expresiones y obtención del tipo de dato
         comprobarTipo("i + c", i + c);
         comprobarTipo("f - c", f - c);
         comprobarTipo("d + f", d + f);
         comprobarTipo("d + i", d + i);
         comprobarTipo("i / f", i / f);
         comprobarTipo("s + j", s + j);
         comprobarTipo("d + j", d + j);
         comprobarTipo("s * c", s * c);
         comprobarTipo("d + c", d + c);
         comprobarTipo("b + c", b + c);
         comprobarTipo("b / c + s", b / c + s);
         comprobarTipo("c + c", c + c);
         comprobarTipo("i + ln + d", i + ln + d);
         comprobarTipo("ln + c", ln + c);
         comprobarTipo("5 / j", 5 / j);
         comprobarTipo("5.2 / j", 5.2 / j);
         comprobarTipo("i * f * 2.5", i * f * 2.5);
         comprobarTipo("ln * f * 2.5F", ln * f * 2.5f);
         comprobarTipo("j - 4L", j - 4L);
         comprobarTipo("j - 4L * 2.5F", j - 4L * 2.5f);
         comprobarTipo("b + 2.5 * i + 35F", b + 2.5 * i + 35f);
         comprobarTipo("'a' + b", 'a' + b);
         comprobarTipo("'a' + c", 'a' + c);
         comprobarTipo("c + 2", c + 2);
         comprobarTipo("c - ln / 2", c - ln / 2);
         comprobarTipo("2 / i + 2.0 / j", 2 / i + 2.0 / j);
     }
 
     // Función para comprobar el tipo de dato y mostrar el resultado
     public static void comprobarTipo(String expresion, Object resultado) {
         System.out.println("\n"+expresion + " = " + resultado + " \n-> Tipo de dato: " + resultado.getClass().getSimpleName());
    
    }
}
