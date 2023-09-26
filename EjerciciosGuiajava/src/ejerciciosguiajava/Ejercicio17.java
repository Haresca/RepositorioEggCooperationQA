/*Ejercicio 17
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package ejerciciosguiajava;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author hesca
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de enteros del vector: ");
        int N = leer.nextInt();
        int vector[] = new int[N];
        int resultado[] = new int[5];
        for (int i = 0; i < 5; i++) {
            resultado[i]=0;
        }
        for (int i = 0; i < N; i++) {
            vector[i]= (int) (12900*Math.random());  //Casteo
         // System.out.println(vector[i]);
        }
        System.out.println("Vector relleno: "+ Arrays.toString(vector));
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 5; j++) {
                if (vector[i]/ (int)Math.pow(10, j+1)==0) {
                    resultado[j]++;
                    break;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Elementos con " +(i+1)+" dígitos: " + resultado[i]);
        }
    }
}
