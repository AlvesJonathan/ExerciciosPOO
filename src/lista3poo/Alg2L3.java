package lista3poo;

/**
 *
 * @author Jonathan
 */
public class Alg2L3 {
    private String sigla;
    
    public void setSigla(String sigla){
        this.sigla = sigla;
    }
    public String getVersigla(){
        if("RJ".equals(sigla)){
            return "Carioca!";
        }
        else if("SP".equals(sigla)){
            return "Paulista!";
        }
        else if("MG".equals(sigla)){
            return "Mineiro";
        }
        else{
            return "Outro Estado!";
        }
        
    }
    
}
