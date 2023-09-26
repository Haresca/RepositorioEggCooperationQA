/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1Animales;


/**
 *
 * @author hesca
 */
public class Animal {

    protected String nombre;
    protected String alimento;
    protected Integer edad;
    protected String raza;

    public Animal() {
    }

    public Animal(String nombre, String alimento, Integer edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    
    public void Alimentarse() {

        System.out.println("Soy " + nombre + " y como " + alimento);

    }
}






//            if (Object o instanceof Perro) {
//                System.out.println("Como perro que soy, como" + ((Perro) o).alimento);
//                
//            } else if (a instanceof Gato) {
//                System.out.println("Como gato que soy, como" + ((Gato) o).alimento);
//
//            } else if (a instanceof Caballo) {
//                System.out.println("Como caballo que soy, como" + ((Caballo) o).alimento);