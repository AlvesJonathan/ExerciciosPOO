package lista3poo;

/**
 *
 * @author Jonathan
 */
public class Alg3L3 {
    private int num1, num2;
    
    public void setNum1(int num1){
        this.num1 = num1;
    }
    public void setNum2(int num2){
        this.num2 = num2;
    }
    
    public String getVernum(){
        if(num1 == num2){
            return "Iguais!";
        }
        else{
            return "Diferentes!";
        }
    }
}
