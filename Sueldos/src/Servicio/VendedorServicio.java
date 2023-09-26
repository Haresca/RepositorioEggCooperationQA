/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Date;
import java.util.Scanner;
import sueldos.Entidades.Vendedor;

/**
 *
 * @author hesca
 */
public class VendedorServicio {

    Scanner read = new Scanner(System.in);

    //Método que retorna objeto
    public Vendedor altaVendedor() {
        //Instanciar objeto
        Vendedor v1 = new Vendedor();
        //Llenar atributos de objeto

        System.out.println("Ingrese el nombre del vendedor: ");
        v1.setNombre(read.next());
        System.out.println("Ingrese el DNI del vendedor: ");
        v1.setDni(read.nextInt());
        System.out.println("Ingrese el sueldo básico del vendedor: ");
        v1.setSueldoBasico(read.nextDouble());
        System.out.println("Ingrese el día de inicio de trabajo del vendedor: ");
        int day = read.nextInt();
        System.out.println("Ingrese el mes de inicio de trabajo del vendedor: ");
        int month = read.nextInt();
        System.out.println("Ingrese el año de inicio de trabajo del vendedor: ");
        int year = read.nextInt();
        Date fecha = new Date(year - 1900, month - 1, day);
        v1.setFechaInicio(fecha);

        return v1;

    }

    public void sueldoMensual(Vendedor v1) {
        System.out.println("Ingrese las ventas totales del vendedor: ");
        Double ventas = read.nextDouble();
        v1.setComisiones(ventas * 0.15);
        v1.setSueldoMensual(v1.getSueldoBasico() + v1.getComisiones());
        System.out.println("El sueldo básico del vendedor " + v1.getNombre() + " es de $" + v1.getSueldoMensual());
    }

    public void vacaciones(Vendedor v1) {
        Date hoy = new Date();
        int antiguedad = hoy.getYear() - v1.getFechaInicio().getYear();

        if (antiguedad < 5) {
            System.out.println("Le corresponden 14 días de vacaciones.");
        } else if (antiguedad < 10) {
            System.out.println("Le corresponden 21 días de vacaciones.");
        } else if (antiguedad < 20) {
            System.out.println("Le corresponden 28 días de vacaciones.");
        } else if (antiguedad > 20) {
            System.out.println("Le corresponden 35 días de vacaciones.");
        } else {
            System.out.println("El vendedor tiene vacaciones proporcionales.");
        }
    }
}
