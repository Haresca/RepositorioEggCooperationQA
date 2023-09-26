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
public class BarcoDeMotor extends Barco{
    protected Integer potenciaCV;
    protected Double precio;
    
    public BarcoDeMotor() {
    }

    public BarcoDeMotor(Integer potenciaCV, String matricula, Integer eslora, Date fechaFabricacion, Alquiler alquiler) {
        super(matricula, eslora, fechaFabricacion, alquiler);
        this.potenciaCV = potenciaCV;
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
        
        return precioFinal + this.potenciaCV;
    }
    
    @Override
    public String toString() {
        return super.toString() + "potenciaCV=" + potenciaCV + '}';
    }

    
    
}
