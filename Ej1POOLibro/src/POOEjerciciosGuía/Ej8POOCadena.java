/*
En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada.
 */
package POOEjerciciosGuía;

import Entidades.Cadena;
import Servicio.CadenaServicio;
import java.util.Scanner;


/**
 *
 * @author hesca
 */
public class Ej8POOCadena {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CadenaServicio cs = new CadenaServicio();
        Scanner read = new Scanner(System.in);
        Cadena cade1 = new Cadena();
        System.out.println("Ingrese la o las palabras (separadas por espacio): ");
        cade1.setFrase(read.nextLine());
        cade1.setLongitud(cade1.getFrase().length());
        
        System.out.println("La frase contiene "+cs.mostrarVocales(cade1)+ " vocales");
        cs.invertirFrase(cade1);
        System.out.println("El caracter ingresado se repite "+cs.vecesRepetido(cade1)+ " veces.");        
        System.out.println("LA segunda frase difiere de la primera en "+cs.compararLongitud(cade1)+ " caracteres");
    }
    
}
