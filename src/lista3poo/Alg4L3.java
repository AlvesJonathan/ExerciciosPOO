package lista3poo;

/**
 *
 * @author Jonathan
 */
public class Alg4L3 {
    private String num;
    
    public void setNum(String num){
        this.num = num;
    }
    
    public String getSemana(){
        switch(num){
            case "1":
                return "Domingo";
            
            case "2":
                return "Segunda";
                
            case "3":
                return "Terça";
                
            case "4":
                return "Quarta";
            
            case "5":
                return "Quinta";
                
            case "6":
                return "Sexta";
            
            case "7":
                return "Sabado";
                
            default :
                return "Opcao invalida";
        }
        
    }
    
}
