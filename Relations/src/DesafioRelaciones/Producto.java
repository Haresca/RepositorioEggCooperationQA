/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesafioRelaciones;

import java.util.Objects;

/**
 *
 * @author hesca
 */
public class Producto {

    private Integer id;
    private String nombre;
    private Double precio;
    private static Integer generador = 0;

    public Producto() {
        generador++;
        id = generador;
    }

    public Producto(String nombre, Double precio) {
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\''+
                ", precio=" + precio + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(getNombre(), producto.getNombre());
        }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre());
    }

    
    
}
