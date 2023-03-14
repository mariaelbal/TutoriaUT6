/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutoriaut6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author María Navarro Elbal
 */
public class CadenasCaracteres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        String cadena = "El resultado de la operacion es :";
//
//        System.out.println(cadena + 45);
//
//        cadena = cadena.concat(Integer.toString(45));
//
//        System.out.println(cadena);
//
//        int array[] = new int[5];
//
//        int tamaño = array.length;

//        System.out.println(cadena.length());
//        System.out.println(cadena.charAt(cadena.length() - 1));
//        System.out.println(cadena.charAt(0));
//        System.out.println(cadena.substring(3));
//        System.out.println(cadena.substring(0, 3));
//        String pi = "3.1416";
//        double PI = Double.parseDouble(pi);
//        double resultado = 3 * PI;
//        System.out.println(resultado);
//        System.out.printf("%5d\n", 10);
//
//        int decimal = 10;
//        System.out.println(String.format("%5d", decimal));
//
//        int i = 10;
//        int j = 20;
//        String d = String.format("%1$d multiplicado por %2$d (%1$dx%2$d)es %3$d", i, j, i * j);
//        System.out.println(d);
//
//        StringBuilder cadenaBuilder = new StringBuilder("hola mundo");

        //System.out.println(cadena.su);
//        int contadore = 0;
//
//        for (int i = 0; i < cadena.length(); i++) {
//
//            if (cadena.toLowerCase().charAt(i) == 'e') {
//                contadore++;
//            }
//
//        }
//        System.out.println("numero de e de mi cadena " + contadore);
//
//        System.out.println(cadena.substring(0, 4));
//
//        String PI = "3.1416";
//        double pi = Double.valueOf(PI);
//        double a = 3;
//
//        double i = 10;
//        double j = 20;
//        String d = String.format("%1$.2f multiplicado por %2$.2f (%1$fx%2$f)es %3$.2f", i, j, i * j);
//
//        System.out.println(d);
//        
        Pattern p = Pattern.compile("[0-9]+");
        Matcher m = p.matcher("1333");
        if (m.matches()) {

            System.out.println("Si, contiene el patrón");
        } else {
            System.out.println("No, no contiene el patrón");
        }
    }

}
