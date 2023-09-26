/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascota.servicios;

import java.util.Scanner;
import mascotappEntidades.Mascota;

/**
 *
 * @author hesca
 */
public class ServicioMascota {

    private Scanner read = new Scanner(System.in).useDelimiter("\n");  //var global, atributo del servicio

    public Mascota crearMascota() {
        
        System.out.println("Ingrese el nombre: ");
        String nombre = read.next();
        
        System.out.println("Ingrese el apodo: ");
        String apodo = read.next();
        
        System.out.println("Ingrese el tipo: ");
        String tipo = read.next();
        
        return new Mascota(nombre, apodo, tipo);
                
        /*alternativa a la última línea:   
        Mascota m = new Mascota(nombre, apodo, tipo);
        
        return m; */
    }
}
