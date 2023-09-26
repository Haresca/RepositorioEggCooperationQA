/* Ejercicio 7
 Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
 */
package ejerciciosguiajava;

import java.util.Scanner;

/**
 *
 * @author hesca
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese la frase: ");
        frase= leer.nextLine();
        if (frase.equalsIgnoreCase("eureka")) {
            System.out.println("¡Correcto!");
        } else {
            System.out.println("¡Incorrecto! :(");
        }
    }   
}
