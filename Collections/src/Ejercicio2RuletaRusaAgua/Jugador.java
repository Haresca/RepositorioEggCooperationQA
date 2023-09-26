package Ejercicio2RuletaRusaAgua;

//atributos: id (representa el n�mero del
//jugador), nombre (Empezara con Jugador m�s su ID, �Jugador 1� por ejemplo) y mojado (indica
//si est� mojado o no el jugador). El n�mero de jugadores ser� decidido por el usuario, pero
//debe ser entre 1 y 6. Si no est� en este rango, por defecto ser� 6.

public class Jugador {
	
	private int internalId = 0;
	private int id;
	private String nombre;
	private boolean mojado;
	
	public Jugador() {
		//id = internalId +1;
	}
	
	
	public Jugador( int id ,String nombre, boolean mojado) {
		super();
		this.id = id;
		//this.id = internalId +1;
		this.nombre = nombre;
		this.mojado = mojado;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
		//this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isMojado() {
		return mojado;
	}
	public void setMojado(boolean mojado) {
		this.mojado = mojado;
	}


	@Override
	public String toString() {
		return "Jugador [id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + "]";
	}
	
	
	
	
	
	

}
