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
public class Patrones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Pattern p = Pattern.compile("\\w*");
        Matcher m = p.matcher("ADFASadfasd98989");

        if (m.matches()) {

            System.out.println("Si, contiene el patrón");
        } else {
            System.out.println("No, no contiene el patrón");
        }
        
//        while (m.find()){
//            System.out.println("inicio "+m.start());
//            System.out.println("fin "+m.end());
//        
//        }
        

//        Pattern p2 = Pattern.compile("[01]+");
//        Matcher m2 = p2.matcher("00002010");
//        while (m2.find()) {
//            System.out.println(m2.start());
//            System.out.println(m2.end());
//        }
    }

}
