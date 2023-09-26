/*  Ejercicio 7
 Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
promedio de n números (n>0). El valor de n se solicitará al principio del programa y los
números serán introducidos por el usuario. Realice dos versiones del programa, una
usando el bucle “while” y otra con el bucle “do - while”.
 */
package ejerciciosguiajava;

import java.util.Scanner;

/**
 *
 * @author hesca
 */
public class EjercicioExtra7valoresDenumeros {

    /**
     * @param args the command line arguments
     */
    //versión While 
    /*  public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double average = 0.0;
        int maxvalue, minvalue;
        int var = 0;
        System.out.print("Ingrese la cantidad de números por registrar: ");
        int N = read.nextInt();
        int numbers[] = new int[N];
        System.out.print("Ingrese el número " + (var + 1) + ": ");
        numbers[var] = read.nextInt();
        maxvalue = minvalue = numbers[0];
        while (var < N) {
            if (maxvalue < numbers[var]) {
                maxvalue = numbers[var];
            }
            if (minvalue > numbers[var]) {
                minvalue = numbers[var];
            }
            average += numbers[var];
            var++;
            if (var !=N) {
                System.out.print("Ingrese el número " + (var + 1) + ": ");
                numbers[var] = read.nextInt();
            }
        }
        average = average / N;
        System.out.println("- El valor máximo ingresado es " + maxvalue);
        System.out.println("- El valor mínimo ingresado es " + minvalue);
        System.out.println("- El promedio de los números ingresados es de " + average);
    }*/
    
    
    //versión DoWhile
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double average = 0.0;
        int maxvalue, minvalue;
        int var = 0;
        System.out.print("Ingrese la cantidad de números por registrar: ");
        int N = read.nextInt();
        int numbers[] = new int[N];
        System.out.print("Ingrese el número " + (var + 1) + ": ");
        numbers[var] = read.nextInt();
        maxvalue = minvalue = numbers[0];
        do {
            if (maxvalue < numbers[var]) {
                maxvalue = numbers[var];
            }
            if (minvalue > numbers[var]) {
                minvalue = numbers[var];
            }
            average += numbers[var];
            var++;
            if (var != N) {
                System.out.print("Ingrese el número " + (var + 1) + ": ");
                numbers[var] = read.nextInt();
            }
        } while (var < N);

        average = average / N;
        System.out.println("- El valor máximo ingresado es " + maxvalue);
        System.out.println("- El valor mínimo ingresado es " + minvalue);
        System.out.println("- El promedio de los números ingresados es de " + average);
    }
}
