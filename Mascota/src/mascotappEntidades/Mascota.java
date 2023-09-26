/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotappEntidades;

/**
 *
 * @author hesca
 */
public class Mascota {

    private String nombre;
    private String apodo;    
    private String tipo;   //Conejo, gato, perro...
    private String color;
    private String raza;
    private boolean cola;
    private int edad;
    private int energia;    //   o private int energia=1000;

    
    public Mascota() {
        energia=1000;
    }
    
    public Mascota(String nombre, String apodo, String tipo) {
        this.nombre = nombre;   //atributo==parámetro que llega
        this.apodo = apodo;
        if (tipo.equals("Perro") || tipo.equals("Gato") || tipo.equals("Loro")) {
            this.tipo = tipo;
        }
        this.energia=1000;
    }
    
    public Mascota(String nombre, String apodo, String tipo, String color, String raza, boolean cola, int edad) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.raza = raza;
        this.cola = cola;
        this.edad = edad;
        this.energia=1000;

    }
    
    public void setNombre(String nombre) {
        if (nombre.length() > 0) {
            this.nombre = nombre;
        }        
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public String getRaza() {
        return raza;
    }

    public boolean isCola() {
        return cola;
    }

    public int getEdad() {
        return edad;
    }
    
    /**
     * Función destinada a pasear
     * @param energiaRestar
     * @return energia
     */
    
    public int pasear(int energiaRestar){
        energia = energia - energiaRestar;  // o  energia -= energiaRestar
        return energia;
    }

    /**
     * Función destinada a pasear con vueltas
     * @param energiaRestar
     * @param vueltas
     * @return energia
     */
    public int pasear(int energiaRestar, int vueltas){
        for (int i = 0; i < vueltas; i++) {
            energia -= energiaRestar;
        }
        return energia;
    }
    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", raza=" + raza + ", cola=" + cola + ", edad=" + edad + ", energia=" + energia + '}';
    }
    
   
    
    
}
