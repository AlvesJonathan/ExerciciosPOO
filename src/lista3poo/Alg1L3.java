package lista3poo;

/**
 *
 * @author Jonathan
 */
public class Alg1L3 {
    private int num;
    
    public void setNum(int num){
        this.num = num;
    }
    public String getMens(){
        if(num>20){
            return "Maior que 20";
        }
        else if(num == 20){
            return "Igual a 20";
        }
        else{
            return "Menor que 20";
        }
    }
}
