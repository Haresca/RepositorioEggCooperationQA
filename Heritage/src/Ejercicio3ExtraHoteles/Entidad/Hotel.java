/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import Ejercicio3ExtraHoteles.Entidad.Alojamiento;

/**
 *
 * @author david
 */
public abstract class Hotel extends Alojamiento {

    protected int cantHab;
    protected int numCamas;
    protected int cantPisos;
    protected double pHab;

    public Hotel(String nombre, String direccion, String localidad, String gerente, int cantHabitaciones, int numCamas, int cantPisos, double precioHabitaciones) {
        super(nombre, direccion, localidad, gerente);
        this.cantHab = cantHabitaciones;
        this.numCamas = numCamas;
        this.cantPisos = cantPisos;
        this.pHab = precioHabitaciones;
    }

    public int getCantHab() {
        return cantHab;
    }

    public void setCantHab(int cantHab) {
        this.cantHab = cantHab;
    }

    public int getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public double getpHab() {
        return pHab;
    }

    public void setpHab(double pHab) {
        this.pHab = pHab;
    }
    
    public abstract double precioHabitacion();
    
    @Override
    public String toString() {
        return super.toString() + "cantHabitaciones=" + cantHab + ", numCamas=" + numCamas + ", cantPisos=" + cantPisos + ", precioHabitaciones=" + pHab;
    }    
}
