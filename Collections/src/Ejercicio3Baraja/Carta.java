/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3Baraja;

/**
 *
 * @author hesca
 */

enum Palo {
    ESPADAS, BASTOS, OROS, COPAS
}

public class Carta {
    private int numero;
    private Palo palo;

    public Carta() {
    }

    public Carta(int numero, Palo palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Palo getPalo() {
        return palo;
    }

    @Override
    public String toString() {
        return numero + " de " + palo;
    }
    
    
}
