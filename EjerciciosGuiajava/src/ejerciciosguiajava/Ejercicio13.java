/* Ejercicio 13
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package ejerciciosguiajava;

import javax.swing.JOptionPane;

/**
 *
 * @author hesca
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número: "));
        for(int i=0; i<N;i++){
            if(i==0 || i==N-1){
                for(int j=0;j<N;j++){
                    System.out.print("*");
                }
            }else{
                for(int j=0;j<N;j++){
                    if(j==0 || j==N-1){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
            }System.out.println("");
        }
    }
    
}
