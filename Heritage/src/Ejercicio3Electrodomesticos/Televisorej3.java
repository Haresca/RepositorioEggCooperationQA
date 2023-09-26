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
public class Televisorej3 extends Electrodomesticoej3{
    private double resolucion;
    private boolean tdt;

    public Televisorej3() {
    }

    public Televisorej3(double precio, String color, char consumoEnergetico, double peso, double resolucion, boolean tdt) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }
    public void crearTelevisor(){
        crearElectrodomestico();
//        System.out.println("Ingrese la resolución del televisor: ");
//        resolucion = Double.parseDouble(scan.next());
//        System.out.println("Tiene TDT: (S/N)");
//        String stringTdt = scan.next();
//        if(stringTdt.equalsIgnoreCase("s")){
//            tdt = true;
//        }else{
//            tdt = false;
//        }
        precioFinal();
    }

    @Override
    public void precioFinal(){
        super.precioFinal();
        if(resolucion>40){
            precio+=precio*0.3;
        }
        if(tdt){
            precio+=500;
        }
    }

    @Override
    public String toString() {
        return "Televisor{" +
                "resolucion=" + resolucion +
                ", tdt=" + tdt +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }
}
