/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3Baraja;

import java.util.*;

/**
 *
 * @author hesca
 */
public class ServicioBaraja {

    ArrayList<Carta> bar = new ArrayList();

    public void crearBaraja() {
        for (Palo palo : Palo.values()) {
            for (int numero = 1; numero <= 12; numero++) {
                if (numero != 8 && numero != 9) {
                    bar.add(new Carta(numero, palo));
                }
            }
        }
    }

    public void barajar() {
        Collections.shuffle(bar);
    }

    public Carta siguienteCarta() {
        if (bar.isEmpty()) {
            System.out.println("No hay más cartas en la baraja.");
            return null;
        }
        return bar.get(0);
        //return bar.remove(0);
    }

    public int cartasDisponibles() {
        return bar.size();
    }

    public List<Carta> darCartas(int cantidad) {
        if (cantidad > bar.size()) {
            System.out.println("No hay suficientes cartas disponibles.");
            return null;
        }
        List<Carta> cartasDadas = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            cartasDadas.add(bar.remove(0));
        }
        return cartasDadas;
    }

    public void cartasMonton(List<Carta> monton) {
        if (monton.isEmpty()) {
            System.out.println("Aún no ha salido ninguna carta.");
            return;
        }
        System.out.println("Cartas en el montón:");
        for (Carta carta : monton) {
            System.out.println(carta);
        }
    }

    public void mostrarBaraja() {
        for (Carta carta : bar) {
            System.out.println(carta);
        }
    }

}
