/* Ejercicio 6
 Leer la altura de N personas y determinar el promedio de estaturas que se encuentran
por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package ejerciciosguiajava;

import java.util.Scanner;

/**
 *
 * @author hesca
 */
public class EjercicioExtra6Estaturas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int m=0;
        System.out.print("Ingrese la cantidad de personas por registrar: ");
        int N = read.nextInt();
        //read.skip("\n");
        double generalprom = 0;
        double lowerprom = 0;
        double heights[] = new double[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese la estatura en metros de la persona " + (i+1) + " :");
            heights[i] = read.nextDouble();
            generalprom += heights[i];
            if (heights[i] <= 1.60) {
                lowerprom += heights[i];
                m++;
            }
        }
        generalprom= generalprom/N;
        lowerprom= lowerprom/m;

        System.out.println("El promedio de estaturas menores a 1.60 mts.es de "+(Math.round(lowerprom*100.0)/100.0)
                + " y el promedio de estaturas en general es igual a " +(Math.round(generalprom*100.0)/100.0));
    }

}
