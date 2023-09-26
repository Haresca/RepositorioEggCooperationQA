
package Entidades;

/* @author jmlucero */
public class Rutina {
    
    private static int internalId=0;
    private int id;
    private String nombre;
    private int duracion;
    private int nivelDificultad;
    private String descripcion;
    
    public Rutina() {
        internalId++;
        id=internalId;
        
    }

    public Rutina(String nombre, int duracion, int nivelDificultad, String descripcion) {
        this();
        this.nombre = nombre;
        this.duracion = duracion;
        this.nivelDificultad = nivelDificultad;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Rutina{" + "id=" + id + ", nombre=" + nombre + ", duracion=" + duracion + ", nivelDificultad=" + nivelDificultad + ", descripcion=" + descripcion + '}';
    }

    
    
    /**
     * @return the description
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the duracion
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * @param duracion the duracion to set
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     * @return the nivelDificultad
     */
    public int getNivelDificultad() {
        return nivelDificultad;
    }

    /**
     * @param nivelDificultad the nivelDificultad to set
     */
    public void setNivelDificultad(int nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }
    
    
    
  
    
    

}



/*Crea una clase de entidad llamada "Rutina" con los siguientes atributos: id, nombre, duracion, nivelDificultad,
descripcion*/