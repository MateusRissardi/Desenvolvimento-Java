import java.util.ArrayList;

/**
 * Representa um catálogo de uma coleção de filmes e albums musicais.
 * @author Fernando Santos
 */
public class Catalogo{
    private String colecionador;
    private ArrayList<Item> itens;

    public Catalogo(String colecionador){
        this.colecionador = colecionador;
        this.itens = new ArrayList<Item>();
    }
    
    public ArrayList<Item> getItens(){
        return this.itens;
    }

    public void addItem(Item umItem){
        this.itens.add(umItem);
    }

    public String toString(){
        String texto = "Colecionador: "+this.colecionador+"\n";
        for(Item it: this.itens){
            texto += it.toString();
        }
        return texto;
    }
}
