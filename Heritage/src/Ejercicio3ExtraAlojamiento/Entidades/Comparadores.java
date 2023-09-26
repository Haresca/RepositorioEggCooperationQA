/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3ExtraAlojamiento.Entidades;

import java.util.Comparator;

/**
 *
 * @author hesca
 */
public class Comparadores {

    public static Comparator<Hotel> ordenarPorPrecio = new Comparator<Hotel>() {
        @Override
        public int compare(Hotel t, Hotel t1) {
            return t.getPrecioHabitaciones().compareTo(t1.getPrecioHabitaciones());
        }
    };
}

