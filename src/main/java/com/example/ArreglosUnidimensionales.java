package com.example;

public class ArreglosUnidimensionales {

    public static void declararCrearInicializar() {
        int[] numeros = {1,2,3};
        System.out.println("Primer elemento: " + numeros[0]);
    }

    public static void mostrarLongitud() {
        int[] datos = new int[5];
        System.out.println("Longitud: " + datos.length);
    }

    public static void recorrerConForClasico() {
        int[] arr = {1,2,3};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void recorrerConForEach() {
        int[] arr = {1,2,3};
        for (int num : arr) {
            System.out.println(num);
        }
    }

    public static int[] retornarArray() {
        return new int[]{5,6,7};
    }

    public static void recibirArray(int[] arr) {
        for (int num : arr) {
            System.out.println(num);
        }
    }
}