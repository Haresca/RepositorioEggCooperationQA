/*  Ejercicio 18
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
obtiene cambiando sus filas por columnas (o viceversa).
 */
package ejerciciosguiajava;

import java.util.Arrays;

/**
 *
 * @author hesca
 */
public class Ejercicio18 {

    
    public static void main(String[] args) {
        int matriz[][]= new int [4][4];
        int transpuesta [][];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j]= (int)(36/Math.random()); 
            }
        }
        System.out.println("Matriz: "+ Arrays.deepToString(matriz));
      
        verMatriz(matriz);
        transpuesta=transponerMatriz(matriz);
        verMatriz(transpuesta);

    }
    private static void verMatriz(int[][] matriz) {
        System.out.println("Matriz: ");
        for (int i = 0; i < matriz.length; i++) {        //# de filas
            for (int j = 0; j < matriz[0].length; j++) { //# de columnas de fila 0
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    private static int[][] transponerMatriz(int[][] matriz) {
        int[][]trans= new int[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                trans[j][i]=matriz[i][j];
            }
        }
        return trans;
    }
}
