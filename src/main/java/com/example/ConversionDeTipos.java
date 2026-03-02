package com.example;

public class ConversionDeTipos {

    public static void demostrarCastingImplicito() {
        int numero = 10;
        double convertido = numero;
        System.out.println("Casting implicito (int a double): " + convertido);
    }

    public static void demostrarCastingExplicito() {
        double numero = 9.8;
        int convertido = (int) numero;
        System.out.println("Casting explicito (double a int): " + convertido);
    }

    public static void demostrarProblemasDePrecision() {
        double numero = 9.99;
        int convertido = (int) numero;
        System.out.println("Perdida de precision: " + convertido);
    }
}