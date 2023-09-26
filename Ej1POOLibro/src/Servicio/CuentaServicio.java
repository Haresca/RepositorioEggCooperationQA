/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author hesca
 */
public class CuentaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cuenta crearCuenta() {
        Cuenta c1 = new Cuenta();
        System.out.println("Ingrese el número de cuenta");
        c1.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese el DNI del cliente");
        c1.setDNIcliente(leer.nextLong());
        System.out.println("Ingrese el interés de la cuenta");
        c1.setInteres(leer.nextDouble());        
        c1.setSaldoActual(0);

        return c1;
    }

    public void ingresar(Cuenta c1) {
        System.out.println("Ingrese la cantidad de dinero para depositar:");
        int ingreso = leer.nextInt();
        c1.setSaldoActual(c1.getSaldoActual() + ingreso);
    }

    public void retirar(Cuenta c1) {
        System.out.println("Ingrese la cantidad de dinero para retirar:");
        int retiro = leer.nextInt();
        if (c1.getSaldoActual() > retiro) {
            c1.setSaldoActual(c1.getSaldoActual() - retiro);
        } else {
            c1.setSaldoActual(0);
        }
    }

    public void extraccionRapida(Cuenta c1) {
        if (c1.getSaldoActual() > 0) {
            c1.setSaldoActual((80 * c1.getSaldoActual()) / 100);
            System.out.println("Ha retirado el 20% del último saldo de su cuenta.");
        } else {
            System.out.println("No dispone de fondos para hacer el retiro.");
        }
    }

    public void consultarSaldo(Cuenta c1){
        System.out.println("Su saldo disponible de cuenta es de $" + c1.getSaldoActual()+ " ,moneda corriente");
    }
    
    public void consultarDatos(Cuenta c1){
        System.out.println("--DATOS DE CUENTA--");
        System.out.println(c1.toString());
    }
}
//h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
