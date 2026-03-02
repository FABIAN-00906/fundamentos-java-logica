package com.example;

public class MetodosEstaticosSimples {

    public static void ejemploDeclaracionLlamada() {
        System.out.println("Metodo sin parametros");
    }

    public static void ejemploPasoParametros(String nombre) {
        System.out.println("Hola " + nombre);
    }

    public static int ejemploRetornoValores(int a, int b) {
        return a + b;
    }

    public static int suma(int a, int b) {
        return a + b;
    }

    public static double suma(double a, double b) {
        return a + b;
    }
}