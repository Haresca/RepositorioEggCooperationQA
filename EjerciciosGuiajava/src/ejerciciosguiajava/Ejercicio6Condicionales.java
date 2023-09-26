/* Ejercicio 6 
Crear un programa que determine si un número es par o impar.
 */
package ejerciciosguiajava;

import java.util.Scanner;

/**
 *
 * @author hesca
 */
public class Ejercicio6Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese el número que desea evaluar: ");
        num= leer.nextInt();
        if (num%2==0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }
    
}
