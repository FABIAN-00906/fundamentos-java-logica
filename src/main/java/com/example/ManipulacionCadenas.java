package com.example;

public class ManipulacionCadenas {

    public static void demostrarConcatenacion() {
        String a = "Hola";
        String b = "Mundo";
        System.out.println(a + " " + b);
        System.out.println(a.concat(" ").concat(b));
    }

    public static void demostrarMetodosUtiles() {
        String texto = "  Java Programacion  ";

        System.out.println("Length: " + texto.length());
        System.out.println("CharAt: " + texto.charAt(2));
        System.out.println("Substring: " + texto.substring(2,6));
        System.out.println("UpperCase: " + texto.toUpperCase());
        System.out.println("LowerCase: " + texto.toLowerCase());
        System.out.println("Trim: " + texto.trim());
        System.out.println("Contains: " + texto.contains("Java"));
        System.out.println("StartsWith: " + texto.startsWith(" "));
        System.out.println("EndsWith: " + texto.endsWith(" "));
    }

    public static void demostrarInmutabilidad() {
        String texto = "Hola";
        texto.concat(" Mundo");
        System.out.println("String original: " + texto);
    }

    public static void usarStringBuilder() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hola");
        sb.append(" Mundo");
        System.out.println(sb.toString());
    }
}