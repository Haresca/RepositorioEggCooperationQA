package Ejercicio4_AreayPerimetro;

import Interfaces.CalculosFormas;

public class Circulo implements CalculosFormas {
	
	private double radio;
	
	
	public Circulo(double radio) {
		super();
		this.radio = radio;
	}
	
	@Override
	public void calcularArea() {
		double area= PI*(Math.pow(radio, 2));
		System.out.println("El área del círculo es: " + area);
		
	}
	@Override
	public void calcularPerimetro() {
		double perimetro = PI * (radio* 2);
		System.out.println("El perímetro del círculo es: " + perimetro);
		
	}
	
	

}
