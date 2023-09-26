/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1ExtraBarcos;

import java.util.Date;

/**
 *
 * @author Juan
 */
public class Velero extends Barco {
    protected Integer numMastiles;

    public Velero() {
    }
   
    public Velero(Integer numMastiles, String matricula, Integer eslora, Date fechaFabricacion, Alquiler alquiler) {
        super(matricula, eslora, fechaFabricacion, alquiler);
        this.numMastiles = numMastiles;
    }

    public Integer getNumMastiles() {
        return numMastiles;
    }

    public void setNumMastiles(Integer numMastiles) {
        this.numMastiles = numMastiles;
    }
    
    @Override
    public Double precio(){
        Double precioFinal = super.precio() ;
        
        return precioFinal + this.numMastiles;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nnumMastiles=" + numMastiles + '}';
    }
    
    
}
