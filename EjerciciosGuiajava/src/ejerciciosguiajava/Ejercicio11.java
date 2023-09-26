/*Ejercicio 11. Realizar un programa que pida dos números enteros positivos por teclado}
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

public class Ejercicio11 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int num1, num2, op = 0;
        String seg="";
        System.out.println("ingrese el primer numero: ");
        num1 = scan.nextInt();
        System.out.println("ingrese el segundo numero: ");
        num2 = scan.nextInt();
        
        do {
            mostrarMenu();
            op = scan.nextInt();
            switch (op) {
                case 1:
                    System.out.println("la suma es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("la resta es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("la multiplicación es: " + num1 * num2);
                    break;
                case 4:
                    System.out.println("la división es: " + num1 * 1.0 / num2);
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir? (S/N)");
                    seg = scan.next();
                    
                    if (seg.toLowerCase().equals("s")) {
                        System.out.println("bye");
                        break;
                    } else if (seg.toLowerCase().equals("n")) {
                        System.out.println("Volviendo al menú principal...");
                        break;
                    } else {
                        System.out.println("Opción inválida.\n"+"Volviendo al menú principal...");
                        break;}
                default:
                    System.out.println("Opción inválida.\n"+"Volviendo al menú principal..."+"\n");
                    break;
            }
        } while (op != 5 || !seg.equals("s"));
        
    }

    private static void mostrarMenu() {
        System.out.println("MENU");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("Elija opción: ");
    }
    
}
