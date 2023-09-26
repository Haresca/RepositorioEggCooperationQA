package POOEjerciciosGuía;


import Entidades.Persona;
import Servicio.PersonaServicio;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hesca
 */
public class Ej7POOPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaServicio ps = new PersonaServicio();
        // Persona pers1 = new Persona("Juan", "obrero", 46, "h", 65, 2);
        //  Persona pers2 = new Persona("Maruja", "obrera", 36, "m", 55, 2);
        //  Persona pers3 = new Persona("Jairo", "vendedor", 26, "o", 59, 1);
        //  Persona pers4 = new Persona("José", "administrador", 35, "h", 60, 2);

        Persona pers1 = ps.crearPersona();
        Persona pers2 = ps.crearPersona();
        Persona pers3 = ps.crearPersona();
        Persona pers4 = ps.crearPersona();
        
        double imcs[] = {ps.calcularIMC(pers1), ps.calcularIMC(pers2), ps.calcularIMC(pers3), ps.calcularIMC(pers4)};
        boolean mayores[] = {ps.esMayorDeEdad(pers1), ps.esMayorDeEdad(pers2), ps.esMayorDeEdad(pers3), ps.esMayorDeEdad(pers4)};
     //   System.out.println("Matriz: " + Arrays.toString(imcs));
     //   System.out.println("Matriz: " + Arrays.toString(mayores));
        ps.calcularPorcentajes(imcs,mayores);
    }
}


//Si el peso es de 75 kg y la estatura de 1.68 m, el IMC es de 26.57, lo que indica sobrepeso
//Si el peso es de 70 kg y la estatura de 1.75 m, el IMC es de 22.86, lo que indica un peso normal
//Si el peso es de 50 kg y la estatura de 1.60 m, el IMC es de 19.53, lo que indica un peso por debajo de lo normal