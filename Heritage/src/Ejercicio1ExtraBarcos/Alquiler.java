/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1ExtraBarcos;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Juan
 */
public class Alquiler {
    /*
    el nombre, documento del cliente, la fecha de alquiler, fecha de devolución,
    la posición del amarre y el barco que lo ocupará.
    */
    private String nombre;
    private Integer documentoCliente, posicionOcupada;
    private Date fechaAlquiler, fechaDevolucion;
    private Barco barcoOcupado;

    public Alquiler() {
    }

    public Alquiler(String nombre, Integer documentoCliente, Integer posicionOcupada, Date fechaAlquiler, Date fechaDevolucion, Barco barcoOcupado) {
        this.nombre = nombre;
        this.documentoCliente = documentoCliente;
        this.posicionOcupada = posicionOcupada;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.barcoOcupado = barcoOcupado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDocumentoCliente() {
        return documentoCliente;
    }

    public void setDocumentoCliente(Integer documentoCliente) {
        this.documentoCliente = documentoCliente;
    }

    public Integer getPosicionOcupada() {
        return posicionOcupada;
    }

    public void setPosicionOcupada(Integer posicionOcupada) {
        this.posicionOcupada = posicionOcupada;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Barco getBarcoOcupado() {
        return barcoOcupado;
    }

    public void setBarcoOcupado(Barco barcoOcupado) {
        this.barcoOcupado = barcoOcupado;
    }
    
    public Double precio(){
        Double precioFinal;
        long diferenciaMS = this.fechaDevolucion.getTime() - this.fechaAlquiler.getTime();

        // Convertimos la diferencia a días
        long diferenciaEnDias = TimeUnit.MILLISECONDS.toDays(diferenciaMS);
        precioFinal = diferenciaEnDias * this.barcoOcupado.getEslora() * 10d;
        
        return precioFinal;
    }
    
    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", documentoCliente=" + documentoCliente + ", posicionOcupada=" + posicionOcupada + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", barcoOcupado=" + barcoOcupado + '}';
    }
    
    
}
