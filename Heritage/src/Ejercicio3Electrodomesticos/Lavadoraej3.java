/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3Electrodomesticos;

/**
 *
 * @author hesca
 */
public class Lavadoraej3 extends Electrodomesticoej3{
    private int carga;

    public Lavadoraej3() {
    }

    public Lavadoraej3(double precio, String color, char consumoEnergetico, double peso, int carga) {
        super(precio, color, consumoEnergetico, peso); //este es el contructor que va a heredar del padre
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    public void crearLavadora(){
        crearElectrodomestico();
        System.out.println("Ingrese la carga de la lavadora: ");
        carga = Integer.parseInt(scan.next());
        precioFinal();
    }
    @Override
    public void precioFinal(){
        super.precioFinal();
        if(carga>30){
            precio+=500;

        }
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "carga=" + carga +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }
}

