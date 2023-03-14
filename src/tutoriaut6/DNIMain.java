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
public class DNIMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String dni = sc.nextLine();
        boolean valido = true;

        if (comprobar(dni)) {
            System.out.println("Valido");
            Integer entero = Integer.parseInt(dni.substring(0, dni.length()-1));
            
            int caracter = dni.charAt(dni.length() - 1);
            if (entero == 99999999) {
                caracter = caracter + 1;
                entero = 00000001;
            } else {
                entero = entero + 1;
            }
            System.out.println(entero+"-"+Character.toString(caracter));
        } else {
            System.out.println("no valido");
        }

    }

    public static boolean comprobar(String dni) {

        for (int i = 0; i < dni.length() - 1; i++) {

            if (!Character.isDigit(dni.charAt(i))) {
                return false;
            }

        }
        if (!Character.isLetter(dni.charAt(dni.length() - 1))) {
            return false;
        }

        return true;
    }

}
