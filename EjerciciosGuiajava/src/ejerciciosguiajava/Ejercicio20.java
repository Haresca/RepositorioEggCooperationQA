/*Ejercicio 20
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.

Ejemplo de Cuadrado Mágico:  [[2, 7, 6], [9, 5, 1], [4, 3, 8]]
 */
package ejerciciosguiajava;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author hesca
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][]cuadrado= new int[3][3];
        ingresar(cuadrado);
        System.out.println("Matriz: "+ Arrays.deepToString(cuadrado));
        esMagico(cuadrado);
        }
    
    private static int [][] ingresar(int[][]cuadrado) {
        Scanner leer = new Scanner(System.in);
        boolean valido;
        do {    
        valido=true;
        System.out.println("Ingrese los nueve elementos de la matriz (con valores entre 1 y 9): ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cuadrado[i][j]= leer.nextInt();
                if (cuadrado[i][j]==0 || cuadrado[i][j]>9) {
                    System.out.print("Elemento incorrecto. Cada elemento debe ");
                    System.out.println("valer entre 1 y 9.");
                    valido=false;
                    break;
                }
        } 
            if (!valido) {
                System.out.println("Matriz incorrecta. Digítela de nuevo.");
                break;
            }
        }
        } while (!valido);
        return cuadrado;
        }
    
    private static void esMagico(int[][] cuadrado) {
        
        int sumaDiagonal1=0;
        int sumaDiagonal2=0;
        int []sumaFila= new int[3];
        int []sumaColumna=new int[3];
        boolean esMagica=false;

        for (int i = 0; i < 3; i++) {
		sumaDiagonal1 += cuadrado[i][i];
		sumaDiagonal2 += cuadrado[i][3-1-i];
        }
                
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumaFila[i] += cuadrado[i][j];
		sumaColumna[i] += cuadrado[j][i];
            }
        }
        System.out.println("Vector sumafilas: "+ Arrays.toString(sumaFila));
        System.out.println("Vector sumacolumnas: "+ Arrays.toString(sumaColumna));
        System.out.println("Suma diagonal1: "+sumaDiagonal1+"  --Suma diagonal2: " +sumaDiagonal2);
        if (sumaFila[0] == sumaFila[1] && sumaFila[0] == sumaFila[2] && sumaFila[0] == sumaColumna[0] && sumaFila[0]== sumaColumna[1]
            && sumaFila[0]== sumaColumna[2] && sumaFila[0]== sumaDiagonal1 && sumaFila[0]== sumaDiagonal2){
            esMagica=true;
            System.out.println("La matriz es mágica con suma de filas, de columnas y diagonales igual a "+ sumaFila[0]);
        } else {
            System.out.println("¡La matriz no es un cuadrado mágico!");        }   
    } 
   }

