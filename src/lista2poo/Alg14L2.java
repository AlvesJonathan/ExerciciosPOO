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
public class Alg14L2 {
    private int ver;
    
    public void setVer(int ver){
        this.ver = ver;
    }
    
    public String getVer(){
        if(ver%2==0){
            return "PAR";
        } 
        else{
            return "IMPAR";
        }
        
    }
    
}
