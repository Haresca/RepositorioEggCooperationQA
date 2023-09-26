/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.CantanteFamoso;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hesca
 */
public class CantanteFamosoService {

    Scanner leer;
    ArrayList<CantanteFamoso> cantaores;

    public CantanteFamosoService() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.cantaores = new ArrayList();
    }

    public void cargarCantantes() {
        CantanteFamoso c1 = new CantanteFamoso("U2", "No Line on the Horizon");
        CantanteFamoso c2 = new CantanteFamoso("UB40", "Labour of Love");
        CantanteFamoso c3 = new CantanteFamoso("Chente", "Un Millón de Primaveras");
        CantanteFamoso c4 = new CantanteFamoso("Michael Jackson", "Thriller");
        CantanteFamoso c5 = new CantanteFamoso("Madonna", "True Blue");
        cantaores.add(0, c3);
        cantaores.add(1, c5);
        cantaores.add(2, c4);
        cantaores.add(3, c1);
        cantaores.add(4, c2);
    }

    public void agregarCantante() {

        System.out.println("Ingrese el nombre del cantante:");
        CantanteFamoso cc = new CantanteFamoso();
        cc.setNombre(leer.next());
        System.out.println("Ingrese el disco de mayores ventas del cantante:");
        cc.setDiscoConMasVentas(leer.next());
        cantaores.add(cc);
        System.out.println("Cantante agregado exitosamente a la colección.");

    }

    public void mostrarCantantes() {
        cantaores.forEach((cantante) -> System.out.println(cantante));
        System.out.println("");
    }

//      for (CantanteFamoso aux : cantaores) {
//          System.out.println(aux);
//      }
//    public void fabricaCantanteFamoso(List<CantanteFamoso> cantantes) {
//        do {
//            agregarCantanteFamoso(crearCantanteFamoso(), cantantes);
//            System.out.println("desea seguir ingresando cantantes? (S/N)");
//        } while(scan.nextLine().equalsIgnoreCase("s"));
//    }
    public void eliminarCantante() {
        System.out.println("Ingrese el nombre del cantante a eliminar: ");
        String nom = leer.next();
        for (int i = 0; i < cantaores.size(); i++) {
            CantanteFamoso c = cantaores.get(i);
            if (nom.equalsIgnoreCase(c.getNombre())) {
                cantaores.remove(c);
                System.out.printf("El cantante %s se removió exitosamente.\n", nom);
                return;  //rompe el método
            }
        }
        System.out.printf("El cantante %s no se encontró.\n", nom);

        /*  CantanteFamoso cantanteObjetivo = new CantanteFamoso(nom, "");
        if (cantaores.contains(cantanteObjetivo)) {
            System.out.printf("¿Está seguro de eliminar al cantante %s? (S/N)\n", nom);
            if (leer.next().equalsIgnoreCase("s")) {
                cantaores.remove(cantanteObjetivo);
                System.out.printf("El cantante %s se removió exitosamente.\n", nom);
            }
        } else {
            System.out.printf("El cantante %s no se encontró.\n", cantanteObjetivo);
        } */
    }

    public void menuCantantes() {
        boolean salir = false;
        cargarCantantes();

        do {
            System.out.println("Seleccione la opción deseada:");
            System.out.println("1. Agregar un cantante");
            System.out.println("2. Mostrar todos los cantantes");
            System.out.println("3. Eliminar un cantante");
            System.out.println("4. Salir");
            int opc = leer.nextInt();
            switch (opc) {
                case 1:
                    agregarCantante();
                    break;
                case 2:
                    mostrarCantantes();
                    break;
                case 3:
                    eliminarCantante();
                    break;
                case 4:
                    salir = true;
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    throw new AssertionError();
            }

        } while (!salir);
    }
}
