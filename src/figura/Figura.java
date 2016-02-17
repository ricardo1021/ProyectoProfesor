/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

import datos.Cilindro;
import datos.Circulo;

/**
 *
 * @author JAVA
 */
public class Figura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Esa es Pro very good");
       Cilindro cilindro1 = new Cilindro(5f);
       Cilindro cilindro2 = new Cilindro(3f, 2f);
       Circulo cir = new Circulo(11.6f, 20.4f, 0f);
       
       
       System.out.println(cilindro1.getVolumen());
       System.out.println(cilindro2.getVolumen());
       System.out.println(cir.getArea());
    }
}
