import java.util.ArrayList;
public class ReceitaFederal
{
    private ArrayList<Pessoas> pessoas;
    
    public ReceitaFederal(){
        this.pessoas = new ArrayList<Pessoas>();
    }
    
    public void addPessoas(Pessoas umaPess){
        this.pessoas.add(umaPess);
    }
    
    public ArrayList<Pessoas> getPessoas(){
        return this.pessoas;
    }
    
    public void imprimirContribuintesDadosBasicos(){
        String texto = "";
        for(Pessoas umaPess : this.pessoas){
            texto += umaPess.toString() + "\n";
        }
        System.out.println(texto);
    }
    
    public void imprimirContribuintesCompletos(){
        String texto = "";
        for(Pessoas umaPess : this.pessoas){
            texto += umaPess.toString() + ", Imposto: " + umaPess.calcImposto() + "\n";
        }
        System.out.println(texto);
    }
}
