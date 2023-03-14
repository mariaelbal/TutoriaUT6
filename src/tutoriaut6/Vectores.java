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
public class Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        int []array=new int[8];
        Scanner teclado = new Scanner (System.in);
        
        for (int i =0;i<array.length; i++ ){
            array[i]=teclado.nextInt();
        
        }
        for (int i =0;i<array.length; i++ ){
            
            System.out.print(array[i]+" ");
        
        }
        
        
    }
    
}
