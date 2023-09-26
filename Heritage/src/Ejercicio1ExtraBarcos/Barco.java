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
public class Barco {
    protected String matricula;
    protected Integer eslora;
    protected Date fechaFabricacion;
    protected Alquiler alquiler;

    public Barco() {
    }

    public Barco(String matricula, Integer eslora, Date fechaFabricacion, Alquiler alquiler) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.fechaFabricacion = fechaFabricacion;
        this.alquiler = alquiler;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Date getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(Date fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public Double precio(){
        return alquiler.precio();
    }
    
    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", fechaFabricacion=" + fechaFabricacion;
    }
    
    
    
}
