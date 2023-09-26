package Ejercicio3ExtraAlojamiento.Entidades;

public abstract class Hotel extends Alojamiento{

	protected int cantidadHabitaciones;
	protected int numCamas;
	protected int numPisos;
	protected double precioHabitaciones;

	public Hotel(String name, String direccion, String gerente, String localidad, int cantidadHabitaciones, int numCamas, int numPisos,
			double precioHabitaciones) {
		super(name, direccion, gerente, localidad);
		this.cantidadHabitaciones = cantidadHabitaciones;
		this.numCamas = numCamas;
		this.numPisos = numPisos;
		this.precioHabitaciones = calcularPrecioHabitacion();
	}
	
	public double  getPrecioHabitaciones() {
		return precioHabitaciones;
	}

	
	public abstract double calcularPrecioHabitacion();
	
	
	
	

}
