public abstract class Pessoas
{
    protected String nome;
    protected String endereço;
    
    public Pessoas(String nome, String endereço){
        this.nome = nome;
        this.endereço = endereço;
    }
    
    public boolean setNome(String nome){
        if(nome != null){
            this.nome = nome;
            return true;
        }
        else{
            return false;
        }
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public boolean setEndereço(String endereço){
        if(endereço != null){
            this.endereço = endereço;
            return true;
        }
        else{
            return false;
        }
    }
    
    public String toString(){
        return "Nome: " + this.nome + ", Endereço: " + this.endereço; 
    }
    
    public abstract double calcImposto();
}
