/*Ejercicio 2
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package POOEjerciciosGuía;

import Entidades.Circunferencia;

/**
 *
 * @author hesca
 */
public class Ej2POOCircunf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circunferencia circun1 = new Circunferencia();
        circun1.crearCircunferencia(38.88);
        circun1.area();
        circun1.perimetro();
    }
    
}
