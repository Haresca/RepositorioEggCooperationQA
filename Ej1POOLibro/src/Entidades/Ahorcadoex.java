/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author carlo
 */
public class Ahorcadoex {
    private String[] buscar;
    private int cantidadLetra;
    private int jugadasMaximas;

    public Ahorcadoex() {
    }

    public Ahorcadoex(String[] buscar, int cantidadLetra, int jugadasMaximas) {
        this.buscar = buscar;
        this.cantidadLetra = cantidadLetra;
        this.jugadasMaximas = jugadasMaximas;
    }

    public String[] getBuscar() {
        return buscar;
    }

    public void setBuscar(String[] buscar) {
        this.buscar = buscar;
    }

    public int getCantidadLetra() {
        return cantidadLetra;
    }

    public void setCantidadLetra(int cantidadLetra) {
        this.cantidadLetra = cantidadLetra;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }
    
    
    
    
}
