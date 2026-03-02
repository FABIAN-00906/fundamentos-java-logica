package com.example;

public class VariablesYConstantes {

    public static void demostrarDeclaracionAsignacion() {
        int edad = 20;
        double salario = 1500.75;
        char genero = 'M';
        boolean activo = true;

        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
        System.out.println("Genero: " + genero);
        System.out.println("Activo: " + activo);
    }

    public static void demostrarConvencionesNombres() {
        String nombreCompleto = "Juan Perez";
        int numeroDeEstudiantes = 30;

        System.out.println("Nombre completo: " + nombreCompleto);
        System.out.println("Numero de estudiantes: " + numeroDeEstudiantes);
    }

    public static void demostrarConstantes() {
        final double PI = 3.1416;
        final int DIAS_SEMANA = 7;

        System.out.println("PI: " + PI);
        System.out.println("Dias de la semana: " + DIAS_SEMANA);
    }
}
