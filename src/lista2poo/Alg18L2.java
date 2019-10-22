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
public class Alg18L2 {
    private int num1, num2, soma;
    
    public void setNum1(int num1){
        this.num1 = num1;
    }
    public void setNum2(int num2){
        this.num2 = num2;
    }
    public int getSoma(){
        return num1+num2;
    }
    public String getVer(){
        if(getSoma()>10){
            return "Maior que 10";
        }
        else if(getSoma()==10){
            return "Igual a 10";
        }
        else{
            return "Menor que 10";
        }
    }
}
