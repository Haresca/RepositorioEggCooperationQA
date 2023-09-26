/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra4Simulador;

import java.util.*;
import java.util.Set;
import EjercicioExtra4Simulador.Alumno;

/**
 *
 * @author hesca
 */
public class Simulador {

    private List<String> nombres = new ArrayList<>();
    private List<String> apellidos = new ArrayList<>();

    public void cargarNombres() {
        // Inicialización manual de nombres y apellidos
        nombres.add("Juan");
        nombres.add("Ana");
        nombres.add("Pedro");
        nombres.add("Maria");
        nombres.add("Jose");

        apellidos.add("Perez");
        apellidos.add("Gomez");
        apellidos.add("Lopez");
        apellidos.add("Diaz");
        apellidos.add("Ramirez");
    }

    public List<String> generadorNombres() {
        List<String> nombresAleatorios = new ArrayList<>();
        Random rand = new Random();
        for (String nombre : nombres) {
            for (String apellido : apellidos) {
                nombresAleatorios.add(nombre + "" + apellido);
            }
        }
        Collections.shuffle(nombresAleatorios);
        return nombresAleatorios;
    }

    public List<String> generadorDNIs(int cantidad) {
        Set<String> DNIs = new HashSet<>();
        Random rand = new Random();
//        int num = rand.nextInt(455);
        while (DNIs.size() < cantidad) {
            int num = 20000000 + rand.nextInt(30000000);
            DNIs.add(String.valueOf(num));
        }
        return new ArrayList<String>(DNIs);
    }

    public List<Alumno> crearAlumno(int cantidad) {
        List<String> nombres = generadorNombres();
        List<String> DNIs = generadorDNIs(cantidad);
        List<Alumno> alumnos = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            alumnos.add(new Alumno(nombres.get(i), DNIs.get(i), 0));
        }

        return alumnos;
    }
}
