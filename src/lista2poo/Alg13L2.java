package lista2poo;

/**
 *
 * @author Jonathan
 */
public class Alg13L2 {
    private double base;
    private double altura;
    
    public void setBase(double base){
        this.base = base;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public double getArea(){
        return ((base*altura)/2);
    }
}