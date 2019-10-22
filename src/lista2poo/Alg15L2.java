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
public class Alg15L2 {
    private int numpn;
    
    public void setNumpn(int numpn){
        this.numpn = numpn;
    }
    
    public String getNumpn(){
        if(numpn > 0){
            return "Positivo";
        }
        else if(numpn == 0){
            return "Nulo";
        }
        else{
            return "Negativo";
        }
    }
    
}
