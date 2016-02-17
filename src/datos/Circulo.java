/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author JAVA
 */
public class Circulo extends Punto {
    private Float radio;

    public Circulo() {
    }

    public Circulo(Float radio) {
        this.radio = radio;
    }

    public Circulo(Float radio, Float x, Float y) {
        super(x, y);
        this.radio = radio;
    }
    
    

    public Float getRadio() {
        return radio;
    }

    public void setRadio(Float radio) {
        this.radio = radio;
    }
    
    public Float getArea() {
        
        return ((2 * 3.1415f) * (radio * radio)); 
    }
    
}
