/*Ejercicio 10
 Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.
 */
package ejerciciosguiajava;

import java.util.Scanner;

/**
 *
 * @author hesca
 */
public class Ejercicio10SentenciasBreakContinue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor límite positivo: ");
        int lim= leer.nextInt();
        int suma=0;
        while (suma<=lim) {   
            System.out.println("Ingrese el número: ");
            int num= leer.nextInt();
            suma = suma+ num;
        }
        System.out.println("¡El acumulado de numeros rebasó el límite!");
        }
        
}
