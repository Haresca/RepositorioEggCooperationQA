/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author hesca
 */
public class PaisServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashSet<Pais> paises = new HashSet();

    public void crearPais() {
        boolean salir = false;

        do {
            System.out.println("Ingrese el nombre del país:");
            Pais p = new Pais();
            p.setNombre(leer.next());
            paises.add(p);

            System.out.println("¿Desea salir? Elija: 1.SI  2.NO");
            int opc = leer.nextInt();
            if (opc == 1) {
                salir = true;
                mostrarPaises();
            }
        } while (!salir);

    }

    public void mostrarPaises() {
        for (Pais aux : paises) {
            System.out.println(aux);
        }
    }

    public void mostrarPaisesOrdenados() {
        ArrayList<Pais> listaPaises = new ArrayList(paises);
        Collections.sort(listaPaises);
        for (Pais aux : listaPaises) {
            System.out.println(aux);
        }
    }

    public void eliminarPais() {
        Iterator<Pais> it = paises.iterator();
        System.out.println("Ingrese el país que quiere eliminar:");
        String paisaeliminar = leer.next();
        while (it.hasNext()) {
            Pais pa = it.next();
          //  if (paisaeliminar.equals(pa.getNombre())) {
         if (pa.getNombre().equals(paisaeliminar)) {   
             it.remove();
             System.out.println("Elemento hallado y removido.");
             break;
            } else{
             System.out.println("Elemento no hallado en esta posición.");
         }
        }
    }
}
