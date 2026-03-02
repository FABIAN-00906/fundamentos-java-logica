package com.example;

public class Operadores {

    public static void demostrarAritmeticos() {
        int a = 10, b = 3;
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicacion: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulo: " + (a % b));
    }

    public static void demostrarIncrementoDecremento() {
        int x = 5;
        System.out.println("Prefijo ++x: " + (++x));
        System.out.println("Sufijo x--: " + (x--));
    }

    public static void demostrarRelacionales() {
        int a = 5, b = 10;
        System.out.println("a > b: " + (a > b));
        System.out.println("a == b: " + (a == b));
    }

    public static void demostrarLogicos() {
        boolean a = true, b = false;
        System.out.println("a && b: " + (a && b));
        System.out.println("a || b: " + (a || b));
        System.out.println("!a: " + (!a));
    }

    public static void demostrarAsignacionCompuesta() {
        int x = 10;
        x += 5;
        System.out.println("x += 5: " + x);
    }

    public static void demostrarOperadorTernario() {
        int edad = 18;
        String resultado = (edad >= 18) ? "Mayor" : "Menor";
        System.out.println("Resultado ternario: " + resultado);
    }
}