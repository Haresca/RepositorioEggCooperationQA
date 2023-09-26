/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra4Simulador;

/**
 *
 * @author hesca
 */
public class Alumno {
    private String nombrecompleto;
    private String DNI;
    private Integer cantidadvotos;

    public Alumno() {
    }

    public Alumno(String nombrecompleto, String DNI, Integer cantidadvotos) {
        this.nombrecompleto = nombrecompleto;
        this.DNI = DNI;
        this.cantidadvotos = 0;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Integer getCantidadvotos() {
        return cantidadvotos;
    }

    public void setCantidadvotos(Integer cantidadvotos) {
        this.cantidadvotos = cantidadvotos;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombrecompleto=" + nombrecompleto + ", DNI=" + DNI + ", cantidadvotos=" + cantidadvotos + '}';
    }

   
    
    
}
