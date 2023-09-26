/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author hesca
 */
public class Circunferencia {
    private double ratio;
    private double areacircun;
    private double perimcircun;

    public Circunferencia() {
        double ratio = 45.5;
    }

    public void crearCircunferencia(double ratio) {
        this.ratio = ratio;
    }

    public double getRatio() {
        return ratio;
    }

    public void setRatio(double ratio) {
        this.ratio = ratio;
    }
    
//    public double area(double ratio){
//        areacircun = Math.PI * Math.pow(ratio,2);
//        return areacircun;
//    }
    public void area(){
          areacircun = Math.PI * Math.pow(ratio,2);
          System.out.println("El área de la circunferencia es de " +areacircun +" cms.");
    }
    
//    public double perimetro(double ratio){
//        perimcircun = 2 * Math.PI * ratio;
//        return perimcircun;
//    }
    public void perimetro(){
          perimcircun = 2 * Math.PI * ratio;
          System.out.println("El perímetro de la circunferencia es de " +perimcircun +" cms.");
    }
}
