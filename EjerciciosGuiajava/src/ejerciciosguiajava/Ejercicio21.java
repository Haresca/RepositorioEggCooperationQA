/*Ejercicio 21
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3
que se pueden formar en la matriz M, desplazándose por filas o columnas, existe al
menos una que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la
columna de la matriz M en la cual empieza el primer elemento de la submatriz P.
 */
package ejerciciosguiajava;

/**
 *
 * @author hesca
 */
public class Ejercicio21 {

    public static void main(String[] args) {
        int[][] matrizM = {{3,-4,4,0,0,2,5,-2,1,4},
                          {2,0,6,7,3,-3,4,5,1,2},
                          {2,1,-2,1,0,2,1,-2,3,-4},
                          {2,8,4,1,7,0,1,3,-4,2},
                          {1,2,3,4,2,-1,3,0,-2, 7},
                          {2,2,4,4,5,-4,9,2,0, 1},
                          {2,8,1,7,0,1,3,-4,-2,0},
                          {2,5,4,1,3,0,1,-2,-4,5},
                          {1,2,3,4,2,-1,3,0,-2,1},
                          {2,2,4,4,5,-4,9,2,0,6}};
        int[][] matrizP = {{0,-2, 7},
                          {2, 0, 1},
                         {-4,-2, 0}};
        matrizContenida(matrizM,matrizP);
    }
    
    public static void matrizContenida(int[][] matrizM, int[][] matrizP){
        boolean contenida=false;
        for(int i=0; i<matrizM.length-2; i++){
            for(int j=0; j<matrizM.length-2; j++){
                for (int k = 0; k < matrizP.length; k++) {
                    for (int l = 0; l < matrizP.length; l++) {
                         if (matrizM[i][j] != matrizP[k][l]) {
                            System.out.println("Primer elemento distinto" + i+j+k+l);   
                         } else if (matrizM[i][j+1] != matrizP[k][l+1]) {
                         break;} else if (matrizM[i][j+2] != matrizP[k][l+2]) {
                         break;} else if (matrizM[i+1][j] != matrizP[k+1][l]) {
                         break;} else if (matrizM[i+1][j+1] != matrizP[k+1][l+1]) {
                         break;} else if (matrizM[i+1][j+2] != matrizP[k+1][l+2]){
                         break;} else if (matrizM[i+2][j] != matrizP[k+2][l]) {
                         break;} else if (matrizM[i+2][j+1] != matrizP[k+2][l+1]) {
                         break;} else if (matrizM[i+2][j+2] != matrizP[k+2][l+2]){
                         break;} else {
                             contenida=true;
                             System.out.print("La matriz P se encuentra dentro de la matriz M, ");
                             System.out.println("iniciando desde la posición [" +i+ "]["+j+"]");
                             break;
                         }     /*
                        if ((matrizM[i][j] == matrizP[k][l])&&(matrizM[i][j+1] == matrizP[k][l+1])&&(matrizM[i][j+2] == matrizP[k][l+2])
                           &&(matrizM[i+1][j] == matrizP[k+1][l])&&(matrizM[i+1][j+1] == matrizP[k+1][l+1])&&(matrizM[i+1][j+2] == matrizP[k+1][l+2]) 
                           &&(matrizM[i+2][j] == matrizP[k+2][l])&&(matrizM[i+2][j+1] == matrizP[k+2][l+1])&&(matrizM[i+2][j+2] == matrizP[k+2][l+2])){
                             contenida=true;
                             System.out.print("La matriz P se encuentra dentro de la matriz M, ");
                             System.out.println("iniciando desde la posición [" +i+ "]["+j+"]");
                             break;
                             
                       }else{  System.out.println("¡La matriz P NO se encuentra dentro de la matriz M!"+i+j+k+l);
                                continue;              }       */                 

                    }
                }                        System.out.println("¡La matriz P NO se encuentra dentro de la matriz M!");

                                }
            }
        }
}
     

    
