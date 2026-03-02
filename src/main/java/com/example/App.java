package com.example;

public class App {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("      DEMOSTRACION DE EXCEPCIONES       ");
        System.out.println("========================================");

        // ----------------------------------------
        System.out.println("\n--- Tema: Try-Catch (Division por cero) ---");
        ManejoBasicoExcepciones.ejemploTryCatchDivision();

        // ----------------------------------------
        System.out.println("\n--- Tema: Try-Catch (Entrada invalida) ---");
        ManejoBasicoExcepciones.ejemploTryCatchInput();

        // ----------------------------------------
        System.out.println("\n--- Tema: Bloque Finally ---");
        ManejoBasicoExcepciones.ejemploBloqueFinally();

        // ----------------------------------------
        System.out.println("\n--- Tema: Control para evitar cierre del programa ---");
        ManejoBasicoExcepciones.evitarCierrePrograma();

        // ----------------------------------------
        System.out.println("\n========================================");
        System.out.println("Programa ejecutado correctamente.");
        System.out.println("========================================");
    }
}