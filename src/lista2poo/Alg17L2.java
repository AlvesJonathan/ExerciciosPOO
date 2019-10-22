package lista2poo;

/**
 *
 * @author Jonathan
 */
public class Alg17L2 {
    private int numv;
    
     public void setNumv(int numv){
         this.numv = numv;
     }
     
     public String getNumv(){
         if(numv > 20){
             return "Maior que 20";
         }
         else if (numv == 20){
             return "Igual a 20";
         }
         else{
             return "Menor que 20";
         }
     }
    
}
