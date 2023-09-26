/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Random;

/**
 *
 * @author david
 */
public class Hotel4 extends Hotel {

    private String[] tipoGim = {"A", "B"};
    private String gim;
    private String nameRest;
    private int capRest;

    Random tg = new Random();

    public Hotel4(String nombre, String direccion, String localidad, String gerente, int cantHabitaciones, int numCamas, int cantPisos, double precioHabitaciones, String gim, String nameRest, int capRest) {
        super(nombre, direccion, localidad, gerente, cantHabitaciones, numCamas, cantPisos, precioHabitaciones);
        this.gim = tipoGim[tg.nextInt(2)];
        this.nameRest = nameRest;
        this.capRest = capRest;
    }

    public String[] getTipoGim() {
        return tipoGim;
    }

    public void setTipoGim(String[] tipoGim) {
        this.tipoGim = tipoGim;
    }

    public String getGim() {
        return gim;
    }

    public void setGim(String gim) {
        this.gim = gim;
    }

    public String getNameRest() {
        return nameRest;
    }

    public void setNameRest(String nameRest) {
        this.nameRest = nameRest;
    }

    public int getCapRest() {
        return capRest;
    }

    public void setCapRest(int capRest) {
        this.capRest = capRest;
    }

    @Override
    public double precioHabitacion() {
        double precio;
        precio = 50 + (numCamas * cantHab * cantPisos);
        if (capRest <= 30) {
            precio += 10;
        } else if (capRest <= 50) {
            precio += 30;
        } else {
            precio += 50;
        }
        if (gim.equalsIgnoreCase("A")) {
            precio += 50;
        } else {
            precio += 30;
        }
        return precio;
    }

    @Override
    public String toString() {
        return "Hotel4{" + "tipoGim=" + tipoGim + ", gim=" + gim + ", nameRest=" + nameRest + ", capRest=" + capRest + ", tg=" + tg + '}';
    }

}
