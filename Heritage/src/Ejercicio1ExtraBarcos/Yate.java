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
public class Yate extends Barco{
    protected Integer cantCamarotes, potenciaCV;
    protected Double precio;

    public Yate() {
    }

    public Yate(Integer cantCamarotes, Integer potenciaCV, String matricula, Integer eslora, Date fechaFabricacion, Alquiler alquiler) {
        super(matricula, eslora, fechaFabricacion, alquiler);
        this.cantCamarotes = cantCamarotes;
        this.potenciaCV = potenciaCV;
    }

    public Integer getCantCamarotes() {
        return cantCamarotes;
    }

    public void setCantCamarotes(Integer cantCamarotes) {
        this.cantCamarotes = cantCamarotes;
    }

    public Integer getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(Integer potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public Double precio(){
        Double precioFinal = super.precio();
        
        return precioFinal + this.potenciaCV + this.cantCamarotes;
    }
    
    @Override
    public String toString() {
        return super.toString() + "cantCamarotes=" + cantCamarotes + ", potenciaCV=" + potenciaCV + '}';
    }
    
    
    
}
