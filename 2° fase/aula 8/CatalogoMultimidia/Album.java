/**
 * Classe que representa um Album Musical.
 * @author Fernando Santos
 */
public class Album extends Item{
    private String artista;
    private int faixas;
    
    public Album(String titulo, double duracao, String comentario, String artista, int faixas){
        super(titulo, duracao, comentario);
        this.artista = artista;
        this.faixas = faixas;
    }
    
    public String getArtista() {
        return artista;
    }

    public boolean setArtista(String artista) {
        if (!artista.isEmpty()){
            this.artista = artista;
            return true;
        }else{
            return false;
        }
    }

    public int getFaixas() {
        return faixas;
    }

    public boolean setFaixas(int faixas) {
        if (faixas > 0){
            this.faixas = faixas;
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public String toString(){
        return super.toString() +"Artista: " + this.artista + ", "+"Faixas: " + this.faixas;
    }

}
