/*  Ejercicio3
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
Java.
 */
package ejerciciosguiajava;

import java.util.Scanner;

/**
 *
 * @author hesca
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese su nombre: ");
        nombre= leer.nextLine();
        
        System.out.println("Su nombre en mayúsculas es: " +  nombre.toUpperCase());
        System.out.println("Su nombre en minúsculas es: " +  nombre.toLowerCase());

    }
    
}
