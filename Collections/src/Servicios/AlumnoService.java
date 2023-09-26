package Servicios;

import java.util.*;

import Entidades.Alumno;

public class AlumnoService {

	Scanner leer = new Scanner(System.in);
	Alumno alum = new Alumno();

	ArrayList<Double> notasIngresadas = new ArrayList<Double>();
	ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

	public void crearAlumnos() {

		String respuesta;

		do {
			System.out.println("Ingrese el nombre del alumno");
			alum.setNombre(leer.next());

			for (int i = 0; i < 3; i++) {
				System.out.println("Ingresa la nota No." + (i + 1));
				notasIngresadas.add(leer.nextDouble());
				

			}

			alum.setNotas(notasIngresadas);

			System.out.println("desea agregar otro alumnos? s/n");
			respuesta = leer.next();

			alumnos.add(alum);

		} while (respuesta.equalsIgnoreCase("s"));

	}

	public double calcularNotaPromedio() {

		System.out.println("Ingresa el nombre del alumno para calcular su nota");
		String nombre = leer.next();

		int notaFinal = 0;

		for (int i = 0; i < alumnos.size(); i++) {
			if (alum.getNombre().equalsIgnoreCase(nombre)) {
//				for (int j = 0; j < alum.getNotas().size(); j++) {
//					
//				}
				List<Double> notas = alum.getNotas();
				for (Double nota : notas) {
					notaFinal += nota;
				}

			}
		}

		return (double) notaFinal / alum.getNotas().size();
	}

}
