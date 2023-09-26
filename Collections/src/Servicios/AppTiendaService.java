/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.AppTienda;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author hesca
 */
public class AppTiendaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, Double> articulos = new HashMap();

    public void menu() {
        boolean salir = false;

        do {
            System.out.println("Seleccione la opción deseada:");
            System.out.println("1. Agregar un producto");
            System.out.println("2. Editar precio de un producto");
            System.out.println("3. Eliminar un producto");
            System.out.println("4. Mostrar productos existentes");
            System.out.println("5. Salir");
            int opc = leer.nextInt();
            switch (opc) {
                case 1:
                    agregarArticulo();
                    break;
                case 2:
                    editarPrecioArticulo();
                    break;
                case 3:
                    eliminarArticulo();
                    break;
                case 4:
                    mostrarArticulos();
                    break;
                case 5:
                    salir = true;
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    throw new AssertionError();
            }

        } while (!salir);

    }

    public void agregarArticulo() {
        boolean salir = false;

        do {
            System.out.println("Ingrese el nombre del producto:");
            AppTienda p = new AppTienda();
            p.setNombre(leer.next());
            System.out.println("Ingrese el precio del producto:");
            p.setPrecio(leer.nextDouble());
            articulos.put(p.getNombre(), p.getPrecio());

            System.out.println("¿Desea salir? Elija: 1.SI  2.NO");
            int opc = leer.nextInt();
            if (opc == 1) {
                salir = true;
                mostrarArticulos();
            }
        } while (!salir);

    }

    public void editarPrecioArticulo() {
        System.out.println("Ingrese el nombre del artículo que desea editar:");
        String n = leer.next();
        if (articulos.containsKey(n)) {
            System.out.println("Ingrese el precio nuevo del artículo:");
            articulos.replace(n, leer.nextDouble());
        } else {
            System.out.println("El artículo no se encontró");
            return;
        }
    }

    public void mostrarArticulos() {
        System.out.println("---PRODUCTOS EXISTENTES---");
        for (Map.Entry<String, Double> aux : articulos.entrySet()) {
            String key = aux.getKey();
            Double value = aux.getValue();

            System.out.println("Key: " + key + ", Value:" + value);
        }
        System.out.println("--------------------------");
    }

    public void eliminarArticulo() {
        System.out.println("Ingrese el nombre del producto a eliminar: ");
        String nom = leer.next();
        if (!articulos.containsKey(nom)) {
            System.out.println("El artículo no se encontró.");
            return;
        } else {
            articulos.remove(nom);
        }
        System.out.println("El artículo fue eliminado.");
    }
}

