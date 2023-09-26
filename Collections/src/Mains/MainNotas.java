package Mains;

import Servicios.AlumnoService;

public class MainNotas {
	public static void main(String[] args) {
		
		AlumnoService alumS = new AlumnoService();
		
		alumS.crearAlumnos();
		System.out.println("La nota del alumno es: " + alumS.calcularNotaPromedio());
	}

}
