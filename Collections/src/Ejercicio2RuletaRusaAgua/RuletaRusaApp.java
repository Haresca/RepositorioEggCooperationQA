package Ejercicio2RuletaRusaAgua;


public class RuletaRusaApp {

	public static void main(String[] args) {
		
		Revolver re = new Revolver();
		ServicioRevolver sr = new ServicioRevolver();
		ServicioJuego sj = new ServicioJuego();
				
		sj.llenarJuego(sr);
		sj.ronda();
                
	}

}
