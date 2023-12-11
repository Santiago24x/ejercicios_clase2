package com.java;

public class Ejercicio5 {
    
    public static void ejercicio5_1() {

        System.out.println("\n\033[46m" + "Ejercicio 5" + "\033[0m");
        System.out.println("");
        System.out.println("\033[46m" + "Ejercicios con los operadores incremento y decremento:  " + "\033[0m");
        System.out.println("\n\033[46m" + "Ejercicio 5_1" + "\033[0m");

        int x = 10;
        // Imprime el valor actual de x (10)
        System.out.println(x);

        // Incrementa x en 1 y luego imprime el nuevo valor (11)
        x++;
        System.out.println(x);

        // Incrementa x en 1 antes de imprimir el nuevo valor (12)
        System.out.println(++x);

        // Imprime el valor actual de x (12) y luego lo incrementa en 1 (13)
        System.out.println(x++);

        // Imprime el nuevo valor de x después del incremento anterior (13)
        System.out.println(x);

        // Incrementa x en 1 después de imprimir el valor actual (14)
        System.out.println(x++);

        // Incrementa x en 1 antes de imprimir el nuevo valor (15)
        System.out.println(++x);

        // Incrementa x en 1 antes de imprimir el nuevo valor (16)
        System.out.println(++x);

        // Incrementa x en 1 tres veces antes de imprimir el nuevo valor (19)
        ++x;
        x++;
        System.out.println(++x);

        // Imprime el valor actual de x (19) y luego lo incrementa en 1 (20)
        System.out.println(x++);

        // Incrementa x en 1 antes de imprimir el nuevo valor (21)
        System.out.println(++x);
    }

    public static void ejercicio5_2() {

        System.out.println("\n\033[46m" + "Ejercicio 5_2" + "\033[0m");

        // Se declara la variable A de tipo char con valor 'c'
        char A = 'c';
        char B;

        // Se imprime el valor actual de A ('c') y luego se incrementa en 1 ('d')
        System.out.println(A++);

        // Se imprime el valor actual de A ('d') y luego se incrementa en 1 ('e')
        System.out.println(A++);

        // Se incrementa A en 1 antes de imprimir el nuevo valor ('f')
        System.out.println(++A);

        // Se decrementa A en 1 antes de asignar su valor a B ('e')
        B = --A;

        // Se incrementa A en 1 antes de imprimir el nuevo valor ('f')
        System.out.println(++A);

        // Se incrementa A en 1 (se convierte en 'g') y luego se decrementa B en 1 (se convierte en 'd')
        A++;
        --B;
        System.out.println(B++);

        // Se incrementa B en 1 antes de imprimir el nuevo valor ('e')
        System.out.println(++B);

        // Se incrementa A en 1 antes de imprimir el nuevo valor ('h')
        System.out.println(++A);

        // Se imprime el valor actual de B ('e') y luego se decrementa en 1 ('d')
        System.out.println(B--);

        // Se imprime el nuevo valor de A después del incremento anterior ('i')
        System.out.println(A);

        // Se imprime el valor actual de B ('d')
        System.out.println(B); 
    }
}
