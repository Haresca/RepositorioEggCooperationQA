/*  Ejercicio 3
 Elaborar un algoritmo en el cual se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase
String.
 */
package ejerciciosguiajava;

import java.util.Scanner;

/**
 *
 * @author hesca
 */
public class EjercicioExtra3DetectarVocal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Ingrese el caracter: ");
        String caracter = read.nextLine();
        caracter=caracter.toLowerCase();
        if(caracter.equals("a")||caracter.equals("e")||caracter.equals("i")||caracter.equals("o")||caracter.equals("u")){
            System.out.println("El caracter ingresado ES una vocal. ");
        } else {
            System.out.println("El caracter ingresado NO ES una vocal. ");
        }
    }
}
