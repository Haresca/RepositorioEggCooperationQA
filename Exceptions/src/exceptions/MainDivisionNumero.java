
import exceptions.Ejercicio3DivisionNumero;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainDivisionNumero {
    public static void main(String[] args) {
        Ejercicio3DivisionNumero divisionNumero = new Ejercicio3DivisionNumero();
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        String stringNum1 = scan.next();
        System.out.println("Ingrese otro número: ");
        String stringNum2 = scan.next();

        try {
            int num1 = Integer.parseInt(stringNum1);
            int num2 = Integer.parseInt(stringNum2);
            System.out.println(divisionNumero.division(num1,num2));
            System.out.println("fin try");
        } catch (ArithmeticException | NumberFormatException | InputMismatchException ae) {
            System.out.println(ae.getCause());
            System.out.println("Hubo un error en el parseo de datos " + ae);
        }
        System.out.println("Termina el programa.");
    }
}

