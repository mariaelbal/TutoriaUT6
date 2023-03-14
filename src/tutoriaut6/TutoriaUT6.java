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
public class TutoriaUT6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int[] a = {3, 4, 5, 6, 7};

        String[] diasSemana = {"Lunes", "Martes", "Miercoles"};

//        int b = 3;
//        int d = 8;
//
//        System.out.println(suma(b, d));
//        System.out.println(b);
//        

  
        System.out.println(a[0]);

        System.out.println(suma(a));
        System.out.println(a[0]);

        
        
        
        
    }

    public static int suma(int b, int c) {
        b = b + c;
        return b;

    }

    public static int suma(int[] a) {

        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            suma = suma + a[i];
            a[i] = 0;
        }

        return suma;
    }
}
