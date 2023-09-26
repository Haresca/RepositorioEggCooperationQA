package simplyscripting;

import java.util.Scanner;

public class EjEx16 {
	public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Cuantas personas va a ingresar?");
        int cantPersonas = leer.nextInt();
        leer.skip("\n");
        recibirDatos(leer, cantPersonas);
    }

    public static void recibirDatos(Scanner leer, int cantPersonas) {

        String[] nombre = new String[cantPersonas];

        int[] edad = new int[cantPersonas];

        for (int i = 0; i < cantPersonas; i++) {
            System.out.println("Ingresa el nombre de la persona " + (i + 1));

            nombre[i] = leer.nextLine();
            System.out.println("Ingresa la edad de " + nombre[i]);

            edad[i] = leer.nextInt();
            leer.skip("\n");
        }
    }
}
