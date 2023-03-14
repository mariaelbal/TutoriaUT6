/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutoriaut6;

/**
 *
 * @author María Navarro Elbal
 */
import java.util.Scanner;

/**
 *
 * @author María Navarro Elbal
 */
public class Matriz {

   /**
    * 
    * @param matriz comprobamos si es matriz identidad
    * @return boolean (identidad) true si es matriz identidad y false si no lo es 
    */
    public static boolean matrizIdentidad(int[][] matriz) {
        boolean identidad = true;
        /* Recorremos la matriz 
         */
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                /* Si en la diagonal hay un 1 identidad es true
                 */
                if (i == j) {
                    if (matriz[i][j] == 1) {
                        identidad = true;
                    } else {
                        return false;
                    }
                /*comprueba en resto matriz contenga 0*/
                } else if (matriz[i][j] == 0) {
                    identidad = true;
                } else {
                    return false;
                }
            }
        }
        /*Si identidad es true la diagonal es 1 y el resto es 0 = matriz identidad
         */
        return identidad;
    }


     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tamaño matriz cuadrada");
        int tamano = teclado.nextInt();
       
        int matriz[][] = new int[tamano][tamano];

        /* Ponemos a 1 la diagonal, el resto de valores serán 0 a falta de inicialización
         */
        for (int i = 0; i < matriz.length; i++) {
            matriz[i][i] = 1;
        }
        

        /*Mostramos matriz*/
        for (int a = 0; a < matriz.length; a++) {
            for (int m = 0; m < matriz[a].length; m++) {
                System.out.print(matriz[a][m]);
            }
            System.out.println("");
        }
        
        
        if (matrizIdentidad(matriz)) {
            System.out.println("Es matriz identidad");
        }else
            System.out.println("No es matriz identidad");
        

    }
}
