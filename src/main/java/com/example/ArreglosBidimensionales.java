package com.example;

public class ArreglosBidimensionales {

    public static void declararCrearMatrices() {
        int[][] matriz = new int[2][2];
        matriz[0][0] = 1;
        System.out.println("Valor matriz[0][0]: " + matriz[0][0]);
    }

    public static void recorrerMatriz() {
        int[][] matriz = {{1,2},{3,4}};

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j]);
            }
        }
    }
}