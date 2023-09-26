/* Ejercicio 11. Realizar un programa que pida dos números enteros positivos por teclado}
y muestre porpantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
del programa, caso contrario se vuelve a mostrar el menú.
 */
package ejerciciosguiajava;
import java.util.Scanner;
/**
 * @author hesca
 */
public class Ejercicio11IfsnomuestraMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1,valor2;
        String opcion="0";
        
        System.out.println("Ingrese el valor 1 positivo:");
        valor1 = sc.nextInt();
        System.out.println("Ingrese el valor 2 positivo:");
        valor2 = sc.nextInt();
     
        do {
            mostrarMenu();
            opcion = sc.nextLine();
            
            if ("1".equals(opcion)) {
                    System.out.println("Suma: " + (valor1 + valor2));
                    break;
            } else if ("2".equals(opcion)) {
                    System.out.println("Resta: " + (valor1 - valor2));
                    break;
            } else if ("3".equals(opcion)) {
                    System.out.println("Multiplicación: " + valor1 * valor2);
                    break;
            } else if ("4".equals(opcion)) {
                    System.out.println("División: " + (float) valor1 / valor2);
                    break;
            } else if ("5".equals(opcion)) {
                    System.out.println("¿Está seguro que desea salir? (S/N)");
                    opcion = sc.nextLine();
                    if (opcion.toLowerCase().equals("s")) {
                        break;
                    } else if (opcion.toLowerCase().equals("n")) {
                        System.out.println("Volviendo al menú principal...");
                    } else {
                        System.out.println("Opción inválida.\n"); }
            } else {
                System.out.println("Opción inválida.\n");
            }
            System.out.println("");
        } while (!"5".equals(opcion));
    }
    
    private static void mostrarMenu() {
        System.out.println("MENÚ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("\nElija una opción:");
    }
    
    
}
