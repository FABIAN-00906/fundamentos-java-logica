package com.example;

public class EntradaDeDatos {

    public static void leerVariosTipos() {

        int numero = 10;
        double decimal = 5.5;
        String palabra = "Java";
        String lineaCompleta = "Fundamentos de programacion";

        System.out.println("Entero: " + numero);
        System.out.println("Double: " + decimal);
        System.out.println("Palabra: " + palabra);
        System.out.println("Linea completa: " + lineaCompleta);
    }

    public static void manejarSaltoDeLineaPendiente() {

        int numero = 20;
        String texto = "Texto completo correcto";

        System.out.println("Numero leido: " + numero);
        System.out.println("Texto leido: " + texto);
        System.out.println("Nota: Se debe limpiar el salto de linea al usar nextInt() y nextLine().");
    }
}