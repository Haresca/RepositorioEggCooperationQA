package Mains;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainPerro {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    static ArrayList<String> razas = new ArrayList();

    public static void main(String[] args) {

        boolean salir = false;

        do {
            System.out.println("Ingrese una raza de perro:");
            String raza = leer.next();
            razas.add(raza);
            System.out.println("¿Desea salir? ingrese 1.SI 2. NO");
            int opc = leer.nextInt();
            if (opc == 1) {
                salir = true;
            }
        } while (!salir);

        eliminarRaza();
        ordenarArray();
        mostrarRazas();

    }
    
    public static void ordenarArray() {
        Collections.sort(razas);

    }

    public static void eliminarRaza() {

        System.out.println("Ingrese la raza que desea eliminar:");
        String razaE = leer.next();

        for (int i = 0; i < razas.size(); i++) {
            if (razas.get(i).equals(razaE)) {
                razas.remove(i);
            } else{
                System.out.println("La raza ingresada no se encuentra en la lista, por eso no puede eliminarse.");
                break;
            }
        }       

    }

    public static void mostrarRazas() {
        System.out.println(razas.toString());
      /*  for (String aux : razas) {
            System.out.println(aux);
        }   */
        //razas.forEach(System.out::println);
        //razas.forEach(System.out::print);
        //razas.forEach(System.out::printf);
    }

}
