/* Ejercicio 12
 Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
segundo, sino informe que no lo son.
 */
package switchejemplos;

import java.util.Scanner;

/**
 *
 * @author hesca
 */
public class EsMultiploEjercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese el número a evaluar: ");
        num1= scan.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2= scan.nextInt();
        esMultiplo(num1,num2);
    }
    public static void esMultiplo(int num1, int num2) {
        int mod= num1 % num2;
        if (mod==0) {
            System.out.println("El número " +num1 + " es múltiplo del número " +num2);
        } else {
            System.out.println("El número " +num1 + " no es múltiplo del número " +num2);
        }
    }
}
