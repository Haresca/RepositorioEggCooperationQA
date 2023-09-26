/* Ejercicio 8
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares
y la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
package ejerciciosguiajava;

import java.util.Scanner;

/**
 *
 * @author hesca
 */
public class EjercicioExtra8leerEnteros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int readcounter = 0;
        int evencounter = 0;
        int oddcounter = 0;
        int integ;
        System.out.print("Ingrese el número: ");
        integ = read.nextInt();
        do {
            if (integ % 5 != 0 || integ < 0) {
                readcounter++;
            } else {
                break;
            }
            if (integ % 2 == 0) {
                evencounter++;
                readcounter++;
            } else {
                oddcounter++;
                readcounter++;
            }
        } while (integ % 5 != 0 || integ < 0);

        System.out.println("- La cantidad de números leídos es " + readcounter);
        System.out.println("- La cantidad de números pares es " + evencounter);
        System.out.println("- La cantidad de números impares es " + oddcounter);
    }
}
