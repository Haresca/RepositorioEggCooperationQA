/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascota;

//import mascotappEntidades.Perro;

import java.util.Scanner;
import mascota.servicios.ServicioMascota;
import mascotappEntidades.Mascota;


/**
 *
 * @author hesca
 */
public class MascotAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //  Perro Toby = new Perro();
      //  Perro Rocky = new Perro();
   //   Scanner read =new Scanner(System.in);
      
      
  //    Mascota m1 = new Mascota("Johnny", read.next(), "Perro");

   /*   m1.apodo="Tango";
      m1.nombre=read.next();
      m1.tipo="Perro";
      m1.edad=8;
      m1.raza="Doberman";
      m1.cola= true;
      m1.color="Tricolor";   No se usan si hay constructores*/
      
      
   //   System.out.println(m11.apodo+" "+m11.edad+" - "+m11.tipo);
      
  //   m1.setNombre("Pedrito");
      
  //    Mascota m2 = new Mascota();
  //    Mascota m3 = new Mascota();
      
  //    System.out.println(m1.getNombre());
    
   /*   System.out.println(m1);
      System.out.println(m1.toString());
      // m1.pasear(150);
      m1.pasear(150,3);
      System.out.println(m1);
      System.out.println(m1.toString());   */
      
      
//    public String nombre;
//    public String apodo;  //Conejo, gato, perro...
//    public String tipo;
//    public String color;
//    public String raza;
//    public boolean cola;
//    public int edad;

        ServicioMascota sm =new ServicioMascota();
        
        Mascota m1= sm.crearMascota();
        System.out.println(m1.toString());
        
        
        // m1=null;  Garbish collector El intérprete del código elimina el objeto inutilizado
        
        //pasxvalor==copia, pasxref=original--> objetos
    }
    
}
