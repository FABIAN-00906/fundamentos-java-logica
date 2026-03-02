package com.example;

public class EstructurasCondicionales {

    public static void ejemploIf() {
        int edad = 20;
        if (edad >= 18) {
            System.out.println("Mayor de edad");
        }
    }

    public static void ejemploIfElse() {
        int numero = 5;
        if (numero % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
    }

    public static void ejemploIfElseIfElse() {
        int nota = 3;

        if (nota >= 4) {
            System.out.println("Excelente");
        } else if (nota >= 3) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }

    public static void ejemploSwitch() {
        int dia = 2;

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            default:
                System.out.println("Otro dia");
        }
    }
}
