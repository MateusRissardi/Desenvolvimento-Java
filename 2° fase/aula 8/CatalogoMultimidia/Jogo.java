public class Jogo extends Item
{
    private int quantJogadores;
    private String plataforma;
    
    public boolean setQuantJogadores (int quantJogadores){
        if(quantJogadores >= 0){
            this.quantJogadores = quantJogadores;
            return true;
        }
        else{
            return false;
        }
    }
    
    public int getQuantJogadores(){
        return this.quantJogadores;
    }
    
    public boolean setPlataforma (String plataforma){
        if(plataforma != null){
            this.plataforma = plataforma;
            return true;
        }
        else{
            return false;
        }
    }
    
    public String getPlataforma(){
        return this.plataforma;
    }
}
