/* Ejercicio 1
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package ejerciciosguiajava;

import java.util.Scanner;

/**
 *
 * @author hesca
 */
public class EjercicioExtra1ConvertirTiempo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Ingrese el tiempo en minutos: ");
        int tmin = read.nextInt();
        int thour, tdays;
        tdays= tmin/1440;
        thour= (tmin%1440)/60;
        System.out.println("El tiempo de " + tmin +" minutos equivale a "+tdays+" días y a "+thour+ " horas.");
        
    }
    
}
