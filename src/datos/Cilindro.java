/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author JAVA
 */
public class Cilindro extends Circulo {
    private Float altura;

    public Cilindro() {
    }

    public Cilindro(Float altura) {
        this.altura = altura;
        setRadio(1f);
    }
    
    

    public Cilindro(Float altura, Float radio) {
        super(radio);
        this.altura = altura;
    }
    
    

    
//
//    public Cilindro(Float altura, Float radio, Float x, Float y) {
//        super(radio, x, y);
//        this.altura = altura;
//    }
//    
//    

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }
    
    public Float getVolumen() {
        return getArea() * altura;
    }
    
}
