package com.example;

public class TiposDeDatosPrimitivos {

    public static void demostrarEnteros() {
        byte b = 127;
        short s = 32000;
        int i = 2000000;
        long l = 9000000000L;

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
    }

    public static void demostrarFlotantes() {
        float f = 5.5f;
        double d = 10.99;

        System.out.println("float: " + f);
        System.out.println("double: " + d);
    }

    public static void demostrarCaracteres() {
        char letra = 'A';
        System.out.println("char: " + letra);
    }

    public static void demostrarBooleanos() {
        boolean verdadero = true;
        System.out.println("boolean: " + verdadero);
    }
}