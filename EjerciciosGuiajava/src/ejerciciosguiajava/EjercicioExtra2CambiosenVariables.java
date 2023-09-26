/* Ejercicio 2
 Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C,
C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package ejerciciosguiajava;

/**
 *
 * @author hesca
 */
public class EjercicioExtra2CambiosenVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int varA=5; 
        int varB=8;
        int varC=13;
        int varD=20;
        int varAux=0;
        System.out.println("VALORES INICIALES:  A="+varA+",  B="+varB+",  C="+varC+", D="+varD);
        varAux=varB;
        varB=varC;
        varC=varA;
        varA=varD;
        varD=varAux;
        System.out.println("VALORES   FINALES:  A="+varA+", B="+varB+", C="+varC+",  D="+varD);

    }
    
}
