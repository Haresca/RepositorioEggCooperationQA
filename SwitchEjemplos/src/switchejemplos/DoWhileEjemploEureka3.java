/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchejemplos;
import java.util.Scanner;
/**
 *
 * @author hesca
 */
public class DoWhileEjemploEureka3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
         Teniendo en cuenta que la clave es “eureka”, 
         escribir un programa que nos pida ingresar una clave. 
         Sólo se cuenta con 3 intentos para acertar, 
         si fallamos los 3 intentos se deberá mostrar un mensaje indicándonos 
         que hemos agotado esos 3 intentos.  
         Si acertamos la clave se deberá mostrar un mensaje que indique 
         que se ha ingresado al sistema correctamente.
         */
        
        Scanner scan = new Scanner(System.in);

        int codigo, intento;
        intento=0;
        String password;

        do {

            System.out.println("Ingrese su codigo");
            codigo = scan.nextInt();
            System.out.println("Ingrese su contraseña");
            password = scan.next();

            if (codigo != 1024 || !password.equals("eureka")) {
                System.out.println("Su código o contraseña no es correcta");
                intento++;
            }
            if (intento==3) {
                System.out.println("Ha agotado sus tres intentos permitidos.");
                System.out.println("Nuevo usuario.");
                intento=0;
            }
        } while (codigo != 1024 || !password.equals("eureka"));

        System.out.println("Codigo y contraseña correcta!!");
        
    }
    
}
