/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutoriaut6;

import java.util.Scanner;

/**
 *
 * @author María Navarro Elbal
 */
public class Matrices {

    /**
     * @param args the command line arguments
     */
    
    static int sumaArray(int array[][])
    {
        int suma = 0;
        for(int i=0; i<array.length; i++)
        {
            for(int j=0; j<array[i].length; j++)
            {
                suma = suma +array[i][j];
            }  
            
        }
        return suma;
    }   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int [][]array2d = new int[3][4];
        array2d[0][0]=44;
        array2d[0][2]=3;
        array2d[1][0]=3;
        int suma = 0;
//        for (int i=0; i<array2d[0].length;i++ ){
//            
//            suma = suma+array2d[0][i];
//        }
//        System.out.println("suma fila 0 "+suma);
        
        int [][]arrayirregular=new int[3][];
        arrayirregular[0]= new int[3];
        arrayirregular[1]= new int [4];
        arrayirregular[2]= new int [2];
        
        
        for (int i=0; i<arrayirregular.length;i++){
            for (int j=0; j<arrayirregular[i].length;j++){
                arrayirregular[i][j]=teclado.nextInt();
            }
        
        }
        
         for (int i=0; i<arrayirregular.length;i++){
            for (int j=0; j<arrayirregular[i].length;j++){
                System.out.print(arrayirregular[i][j]+ " ");
            }
             System.out.println("");
        
        }
        
        
        
//        suma = 0;
//        
//        for (int i=0; i<array2d.length;i++){
//            for (int j=0; j<array2d[i].length;j++){
//                suma = suma+array2d[i][j];
//            }
//        
//        }
//        
//        System.out.println("suma matriz completa "+suma);
//        
       
                
        
        
        
        
        
        
        
//        int array2d[][] = new int[3][4];
//        array2d[0][0] = 44;
//        array2d[0][1] = 3;
//
//
//        int suma = 0;
//        for (int i = 0; i < array2d.length; i++) {
//            for (int j = 0; j < array2d[i].length; j++) {
//                suma =suma + array2d[i][j];
//            }
//        }
//        System.out.println(suma);
//        suma = sumaArray(array2d);
//        
//        System.out.println(suma);
//        
//        double [][]arrayirregular =new double [3][];
//        arrayirregular[0]= new double [7];
//        arrayirregular[1]= new double [15];
//        arrayirregular[2]= new double [9];
//        
//        
        
        /*
        int[][] array = new int[3][4];
        array[0][0] = 44;
        array[0][1] = 3;
        array[1][1] = 3;
        int suma = 0;
//        for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[0].length; j++) {

            suma = suma + array[0][j];
        }
//        }

        System.out.println(suma);
        int[][][] array3d = new int[5][4][3];

        int[][] arrayIrregular = new int[3][];
        arrayIrregular[0] = new int[2];
        arrayIrregular[1] = new int[1];
        arrayIrregular[2] = new int[2];
        Scanner teclado = new Scanner (System.in);
        for (int i = 0; i < arrayIrregular.length; i++) {

            for (int j = 0; j < arrayIrregular[i].length; j++) {
                System.out.println("fila "+i+" columna "+j);
                arrayIrregular[i][j]=teclado.nextInt();
            }
            System.out.println("");
        }
         */
    }

}
