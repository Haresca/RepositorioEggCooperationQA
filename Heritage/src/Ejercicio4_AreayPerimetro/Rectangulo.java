package Ejercicio4_AreayPerimetro;

import Interfaces.CalculosFormas;

public class Rectangulo implements CalculosFormas {
	
	
	private double base;
	private double altura;
	
	

	public Rectangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	@Override
	public void calcularArea() {
		
		double area = base*altura;
		System.out.println("El área del rectángulo es: " + area);
		
		
	}

	@Override
	public void calcularPerimetro() {
 		double perimetro = (base + altura) *2;
 		System.out.println("El per+imetro del rectángulo es: " + perimetro);
		
	}

}
