/*
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
 */
package Servicio;

import Entidades.Persona;
import java.util.Scanner;
import java.lang.Math; 

/**
 *
 * @author hesca
 */
public class PersonaServicio {
    Scanner read = new Scanner(System.in).useDelimiter("\n");;

    //Método que retorna objeto
    public Persona crearPersona() {
        Persona pers = new Persona();
        //Llenar atributos de objeto
        System.out.println("Ingrese el nombre de la persona: ");
        pers.setNombre(read.next());
        System.out.println("Ingrese la ocupación de la persona: ");
        pers.setOcupacion(read.next());
        System.out.println("Ingrese la edad de la persona: ");
        pers.setEdad(read.nextInt());
        do {            
            System.out.println("Ingrese el sexo de la persona: ");
            pers.setSexo(read.next());
            if(pers.getSexo().equalsIgnoreCase("h") || pers.getSexo().equalsIgnoreCase("m") || pers.getSexo().equalsIgnoreCase("o")){
            } else{
                System.out.println("¡Dato inválido! Intente nuevamente.");
            }
        } while (!pers.getSexo().equalsIgnoreCase("h") && !pers.getSexo().equalsIgnoreCase("m") && !pers.getSexo().equalsIgnoreCase("o"));
        System.out.println("Ingrese el peso en kilogramos de la persona: ");
        pers.setPeso(read.nextDouble());
        System.out.println("Ingrese la altura en metros de la persona: ");
        pers.setAltura(read.nextDouble());
        //v1.setFechaInicio();
        
        return pers;
    }
    
    public double calcularIMC(Persona pers1){
        double altura= pers1.getAltura();
        double imc = pers1.getPeso()/ Math.pow(altura, 2);
        if (imc < 20){
            System.out.println("Se encuentra por debajo de su peso ideal");
            imc= -1;
        } else if (imc>=20 && imc<=25){
            System.out.println("Se encuentra en su peso ideal");
            imc=0;        
        } else {
            System.out.println("Se encuentra por encima de su peso ideal");
            imc= 1;       
        }
        
        return imc;
    }
        
        
    public boolean esMayorDeEdad(Persona pers1){
        boolean mayorDeEdad = false;
        if (pers1.getEdad()<18){
           System.out.println("La persona NO es mayor de edad.");
        } else {
           mayorDeEdad = true;
           System.out.println("La persona es mayor de edad.");
        }
        return mayorDeEdad;
    }
       
    
    public void calcularPorcentajes(double imcs[], boolean mayores[]){
        int bajoimc=0;
        int buenimc=0;
        int altoimc=0;
        int mayor=0;
        int menor=0; 
        for (int i = 0; i < 4; i++) {
            if (imcs[i]<0){
                bajoimc +=1;
            } else if (imcs[i]>0){
                altoimc +=1;
            } else{
                buenimc +=1;
            }
        }
        for (int j = 0; j < 4; j++) {
            if (mayores[j]==false){
                menor +=1;
            } else{
                mayor +=1;
            }
        }
        bajoimc=100*bajoimc/4;
        buenimc=100*buenimc/4;
        altoimc=100*altoimc/4;
        menor=100*menor/4;
        mayor=100*mayor/4;
        System.out.println("--Porcentajes--");
        
        
     // System.out.println(bajoimc+"j"+  buenimc + "j"+altoimc +"j"+ mayor +"j"+ menor);
        System.out.println("- El "+ bajoimc +"% de las 4 personas" +
        " está por debajo de su peso ideal, el "+ buenimc+"% está en su peso ideal"
        +" y el " +altoimc+"% está por encima de su peso ideal.");
        System.out.println("- El "+ menor+"% de las 4 personas" +
        " es menor de edad  y el "+ mayor+"% es mayor de edad.");
    }
    
}
