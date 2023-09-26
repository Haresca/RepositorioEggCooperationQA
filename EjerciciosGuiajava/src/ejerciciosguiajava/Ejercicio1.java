/*
 Ejercicio 1
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 */
package ejerciciosguiajava;

import java.util.Scanner;

/**
 *
 * @author hesca
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, suma;
        System.out.println("Ingrese el primer número entero: ");
        num1= leer.nextInt();
        System.out.println("Ingrese el primer número entero: ");
        num2= leer.nextInt();
        suma=num1+num2;
        System.out.println("El resultado de la suma es " + suma);
    }
    
}
