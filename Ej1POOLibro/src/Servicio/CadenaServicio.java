/*
Deberá además implementar los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package Servicio;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author hesca
 */
public class CadenaServicio {
    public int mostrarVocales(Cadena frase) {
        String nvaFrase = frase.getFrase();
        int contador = 0;
        for (int i = 0; i < frase.getLongitud(); i++) {
            if ((nvaFrase.substring(i, i + 1).equalsIgnoreCase("a")) || (nvaFrase.substring(i, i + 1).equalsIgnoreCase("e")) || (nvaFrase.substring(i, i + 1).equalsIgnoreCase("i")) || (nvaFrase.substring(i, i + 1).equalsIgnoreCase("o")) || (nvaFrase.substring(i, i + 1).equalsIgnoreCase("u"))) {
                contador++;
            }
        }
        return contador;
    }

    public void invertirFrase(Cadena frase) {
        String nvaFrase = frase.getFrase();
        
        for (int i = frase.getLongitud()-1; i > -1; i--) {
            System.out.print(nvaFrase.substring(i, i+1));
        }
        System.out.println("");
    }
    
    public int vecesRepetido(Cadena frase){
        Scanner read = new Scanner(System.in);
        System.out.print("Ingrese un caracter por contabilizar en la frase: ");
        String letra = read.nextLine();        
        String nvaFrase = frase.getFrase();
        int contador= 0;
        for (int i = 0; i < frase.getLongitud(); i++) {
            if ((nvaFrase.substring(i, i + 1).equalsIgnoreCase(letra))) {
                contador++;
            }
        }
        return contador;
    }
    
    public int compararLongitud(Cadena frase){
        Scanner read = new Scanner(System.in);
        System.out.print("Ingrese una segunda frase para comparar su extensión: ");
        String nuevaFrase = read.nextLine();        
        int diferencia= 0;
       // for (int i = 0; i < frase.getLongitud(); i++) {
        if (nuevaFrase.length()== frase.getLongitud()){
        } else {
            diferencia = Math.abs(nuevaFrase.length()- frase.getLongitud());
        }
        return diferencia;    
    }
    
          
//f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
//con una nueva frase ingresada por el usuario y mostrar la frase resultante.
//g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
//encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
//la frase resultante.
//h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
//ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 
}
