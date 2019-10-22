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
public class Alg12L2 {
    private double raio;
    
    public void setRaio(double raio){
        this.raio = raio;
    }
    
    public double getArea(){
        return ((raio*raio)+3.14);
    }
    
    public double getPer(){
        return (3.14*3.14*raio);
    }
    
}
