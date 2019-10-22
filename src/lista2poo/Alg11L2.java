/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2poo;

/**
 *
 * @author Jonathan
 */
public class Alg11L2 {
    private double base, altura;
    
    public void setBase(double base){
        this.base = base;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public double getArea(){
        return (base*altura);
    }
    
    public double getPer(){
        return ((base*2) + (altura*2));
    }
    
    public double getDia(){
        return ((base*base)+(altura*altura));
    }
}
