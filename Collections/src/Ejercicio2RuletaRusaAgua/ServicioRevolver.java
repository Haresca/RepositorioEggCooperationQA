package Ejercicio2RuletaRusaAgua;
import java.util.*;


public class ServicioRevolver {
	
	Revolver revolver = new Revolver();
	
	public void llenarRevolver() {
                Random random = new Random();

		int posicionAleatoria1 = random.nextInt(6);
		int posicionAleatoria2 = random.nextInt(6);
		
		revolver.setPosicionAgua(posicionAleatoria1);
		revolver.setPosicionTambor(posicionAleatoria2);
	
        	System.out.println(revolver.getPosicionAgua());
        	System.out.println(revolver.getPosicionTambor());
                
		
	}
	
	public boolean mojar() {
		return revolver.getPosicionAgua() == revolver.getPosicionTambor();
	}
	
	public void siguienteChorro() {
		if(!mojar() && revolver.getPosicionTambor()<5) {
			revolver.setPosicionTambor(revolver.getPosicionTambor()+1);
                        return;
		}else if (!mojar()){
			revolver.setPosicionTambor(0);
		}
	}
	
	
	
	
}
