/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author hesca
 */
public class Ahorcado {
    private String palabraclave[];
    private int letrasacertadas;
    private int intentosmaximos;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabraclave, int letrasacertadas, int intentosmaximos) {
        this.palabraclave = palabraclave;
        this.letrasacertadas = letrasacertadas;
        this.intentosmaximos = intentosmaximos;
    }


    public String[] getPalabraclave() {
        return palabraclave;
    }

    public void setPalabraclave(String[] palabraclave) {
        this.palabraclave = palabraclave;
    }

    public int getLetrasacertadas() {
        return letrasacertadas;
    }

    public void setLetrasacertadas(int letrasacertadas) {
        this.letrasacertadas = letrasacertadas;
    }

    public int getIntentosmaximos() {
        return intentosmaximos;
    }

    public void setIntentosmaximos(int intentosmaximos) {
        this.intentosmaximos = intentosmaximos;
    }
    
    
}
