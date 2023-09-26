/*Ejercicio 9 
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar
el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.

 * and open the template in the editor.
 */
package switchejemplos;

import java.util.Scanner;

/**
 *
 * @author hesca
 */
public class DOWhileEjercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
        int number, counter, acum;
        acum=0;
        counter=0;
        do {            
            System.out.println("Ingrese el número: ");
            number = read.nextInt();
            
            if (number==0) {
                System.out.println("Se capturó el numero cero");
                break;
            } else if (number>0){
                acum = acum+ number;
                counter++;
            }
        } while (counter != 20 );
        System.out.println("La suma de los veinte números naturales positivos ingresados es igual a " + acum);
    }
   }

