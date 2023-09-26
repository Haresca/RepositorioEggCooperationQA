/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra4Simulador;

import java.util.Scanner;
import java.util.*;
import EjercicioExtra4Simulador.Simulador;
import EjercicioExtra4Simulador.Alumno;

/**
 *
 * @author hesca
 */
public class MainSimulador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Simulador sim = new Simulador();
//        List<String> nombres = new ArrayList<>();
//        sim.cargarNombres();
//        for (String aux : nombres) {
//            System.out.println(aux);
//        }
        System.out.println("Ingrese la cantidad de alumnos:");
        int cant = sc.nextInt();
 //       sim.generadorDNIs(3);
        List<Alumno> alumnos = new ArrayList<>();
        sim.crearAlumno(cant);
        System.out.println("Listado de alumnos:");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }
}
