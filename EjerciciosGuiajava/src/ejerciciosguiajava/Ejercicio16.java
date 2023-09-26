/* Ejercicio 16
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
número y si se encuentra repetido.
 */
package ejerciciosguiajava;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author hesca
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector: ");
        int N = leer.nextInt();
        int vector[] = new int[N];
        for (int i = 0; i < N; i++) {
                vector[i]= (int) Math.round(100*Math.random());  //Casteo
        }
        System.out.println("Vector relleno: "+ Arrays.toString(vector));
        System.out.print("Ingrese el número que quiera buscar en el vector: ");
        int busq = leer.nextInt();
        int contador=0;
        for (int i = 0; i < N; i++) {
            if (vector[i]==busq) {
                System.out.println("El valor " + busq + " se encuentra en la posición " + i);
                contador++;
            } 
        }
        System.out.println("***El valor " + busq + " se encuentra " + contador + " veces en el vector.***");

    }
    
}
