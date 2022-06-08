package com.fizzbuzz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Escriba una función fizzBuzz(n) que recibe un número entero mayor que 0 como parametro y devuelva un array con un
elemento por cada numero entre 1 y el parametro (inclusive). Por cada elemento, debe ser:
 - "fizz" si el numero es divisible por 3
 - "buzz" si el numero es divisible por 5
 - "fizz-buzz" si el numero es divisible por ambos 3 y 5 (con guión entre fizz y buzz)
 - el numero propio si no es divisible ni por 3 ni por 5
*/
public class Main {
    public static void main(String[] args) throws Exception {
        List<Object> test1 = new ArrayList<>();
        test1.add(1);

        System.out.println("Resultado obtenido:");
        System.out.println(ArrayUtils.fizzBuzz(1));

        if (ArrayUtils.fizzBuzz(1).equals(test1)) {
            System.out.println("Resultado esperado:");
            System.out.println(test1 + "\nok!");
        } else {
            System.out.println(test1 + "\nnot ok!");
        }

        List<Object> test2 = Arrays.asList(1, 2, "fizz", 4, "buzz");

        System.out.println("Resultado obtenido:");
        System.out.println(ArrayUtils.fizzBuzz(5));

        if (ArrayUtils.fizzBuzz(5).equals(test2)) {
            System.out.println("Resultado esperado:");
            System.out.println(test2 + "\nok!");
        } else {
            System.out.println(test2 + "\nnot ok!");
        }

        List<Object> test3 = Arrays.asList(1, 2, "fizz", 4, "buzz", "fizz", 7, 8, "fizz", "buzz", 11, "fizz", 13, 14, "fizz-buzz", 16);

        System.out.println("Resultado obtenido:");
        System.out.println(ArrayUtils.fizzBuzz(16));

        if (ArrayUtils.fizzBuzz(16).equals(test3)) {
            System.out.println("Resultado esperado:");
            System.out.println(test3 + "\nok!");
        } else {
            System.out.println(test3 + "\nnot ok!");
        }
    }
}