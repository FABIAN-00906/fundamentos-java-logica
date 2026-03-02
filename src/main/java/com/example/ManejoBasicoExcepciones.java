package com.example;

public class ManejoBasicoExcepciones {

    public static void ejemploTryCatchDivision() {
        try {
            int resultado = 10 / 0;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division por cero controlada.");
        }
    }

    public static void ejemploTryCatchInput() {
        try {
            int numero = Integer.parseInt("abc");
            System.out.println("Numero: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: Entrada invalida detectada.");
        }
    }

    public static void ejemploBloqueFinally() {
        try {
            System.out.println("Bloque try ejecutado.");
        } finally {
            System.out.println("Bloque finally siempre se ejecuta.");
        }
    }

    public static void evitarCierrePrograma() {
        try {
            int numero = Integer.parseInt("xyz");
            System.out.println("Numero convertido: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Excepcion controlada, el programa continua.");
        }

        System.out.println("El programa sigue ejecutandose.");
    }
}