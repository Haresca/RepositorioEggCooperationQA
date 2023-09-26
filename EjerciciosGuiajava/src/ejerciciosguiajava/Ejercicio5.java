/* Ejercicio5
 Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
 */
package ejerciciosguiajava;

import java.util.Scanner;

/**
 *
 * @author hesca
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese el número: ");
        numero= leer.nextInt();                                                       
        System.out.println("El doble del número dado es: " + 2*numero);
        System.out.println("El triple del número dado es: " + 3*numero);
        System.out.println("La raíz cuadrada del número dado es: " + Math.sqrt(numero));
    }   
}
