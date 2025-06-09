import java.util.ArrayList;
public class Portal
{
    private String nome;
    private String url;
    private ArrayList<Anuncio> anuncios;
    
    public Portal(String nome, String url){
        this.nome = nome;
        this.url = url;
        this.anuncios = new ArrayList<Anuncio>();
    }
    
    public void addAnuncio(Anuncio umAnun){
        this.anuncios.add(umAnun);
    }
    
    public ArrayList<Anuncio> getAnuncios(){
        return this.anuncios;
    }
    
    public String toString(){
        String texto = "Nome: " + this.nome + ", URL : " + this.url + "\n";
        for (Anuncio umAnun : this.anuncios){
            texto += umAnun.toString() + "\n";
        }
        return texto;
    }
}
