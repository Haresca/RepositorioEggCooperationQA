/*Ejercicio 15
 Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
package ejerciciosguiajava;

import java.util.Arrays;

/**
 *
 * @author hesca
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vector[] = new int[100];
        for (int i = 0; i < 100; i++) {
                vector[i]= i+1;
        }
       System.out.println("Vector relleno: "+ Arrays.toString(vector));
       System.out.print("Vector invertido: ");
       System.out.print("{");
        for (int i = 99; i >= 0; i--) {
            if (i==0) {
            System.out.print(vector[i]+ "} ");
            break;
            } else {
            }
            System.out.print(vector[i]+ ", ");
        }
    }
}
