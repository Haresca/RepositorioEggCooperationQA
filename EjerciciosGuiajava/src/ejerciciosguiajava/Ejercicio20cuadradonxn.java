/*
 Ejercicio 20
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.

Ejemplo de Cuadrado Mágico:  [[2, 7, 6], [9, 5, 1], [4, 3, 8]]
 */
package ejerciciosguiajava;

import java.util.Scanner;

/**
 *
 * @author hesca
 */
public class Ejercicio20cuadradonxn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int n; 
        System.out.println("ingrese el lado de la matriz: ");
        n = scan.nextInt();
        
        int[][] matriz = new int[n][n];
        
        llenarMatriz(matriz);
        mostrarMatriz(matriz);
        if (validaContenido(matriz)) {
            System.out.println("el contenido es válido.");
            if (validaCuadradoMagico(matriz)) {
                System.out.println("la matriz es un cuadrado mágico");
            } else {
                System.out.println("la matriz no es un cuadrado mágico");
            }
        } else {
            System.out.println("el contenido no es válido.");
        }
    }

    private static void llenarMatriz(int[][] matriz) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("ingrese el valor en la posición (" + i + "," + j + "): ");
                matriz[i][j] = scan.nextInt();
            }
        }
    }

    private static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    private static boolean validaContenido(int[][] matriz) {
        boolean salida = true;
        int limite = matriz.length * matriz.length;
        for (int i = 1; i <= limite; i++) {
            salida = salida && validaValor(matriz, i);
        }
        return salida;
    }

    private static boolean validaValor(int[][] matriz, int valor) {
        boolean salida = false;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                salida = salida || matriz[i][j] == valor;
            }
        }
        return salida; 
    }

    private static boolean validaCuadradoMagico(int[][] matriz) {
        boolean salida = true;
        int suma = 0, acumula = 0, dsec = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[0][i];
        }
        // filas
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                acumula += matriz[i][j];
            }
            salida = salida && acumula == suma;
            acumula = 0;
        }
        // columnas
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                acumula += matriz[j][i];
            }
            salida = salida && acumula == suma;
            acumula = 0;
        }
        //diagonales
        for (int i = 0; i < matriz.length; i++) {
            acumula += matriz[i][i];
            dsec += matriz[i][matriz.length - 1 - i];
        }
        salida = salida && acumula == suma;
        salida = salida && dsec == suma;
        
        return salida;
    }
    
}