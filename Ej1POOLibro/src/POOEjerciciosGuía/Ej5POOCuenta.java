/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOEjerciciosGuía;

import Entidades.Cuenta;
import Servicio.CuentaServicio;
import java.util.Scanner;

/**
 *
 * @author hesca
 */
public class Ej5POOCuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CuentaServicio cs = new CuentaServicio();
        int opcion;
        Cuenta c1 = cs.crearCuenta();
        do {
            System.out.println("---MENÜ---");
            System.out.println("Seleccione la opción:");
            System.out.println("1. Ingresar dinero a Cuenta");
            System.out.println("2. Retirar dinero de Cuenta");
            System.out.println("3. Hacer retiro rápido de Cuenta");
            System.out.println("4. Consultar saldo de Cuenta");
            System.out.println("5. Consultar datos de Cuenta");
            System.out.println("6. Salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    cs.ingresar(c1);
                    break;
                case 2:
                    cs.retirar(c1);
                    break;
                case 3:
                    cs.extraccionRapida(c1);
                    break;
                case 4:
                    cs.consultarSaldo(c1);
                    break;                 
                case 5:
                    cs.consultarDatos(c1);
                    break;
                case 6:
                    System.out.println("¡HASTA PRONTO!");
                    break;
            }

        } while (opcion != 6);
    }

}
