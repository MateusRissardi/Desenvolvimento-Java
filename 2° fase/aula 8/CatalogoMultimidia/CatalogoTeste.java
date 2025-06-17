import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class CatalogoTeste
{
    @Test
    public void CatalogoTeste(){
        Catalogo cat1 = new Catalogo ("Alan");
        
        Album alb1 = new Album ("Pulse", 90, "gostei", "Pink Floyd", 10);
        Album alb2 = new Album ("Abbey Road", 50, "Bom", "The Beatles", 8);
        
        Filme fil1 = new Filme ("Star Wars", 120, "Top", "George Lucas");
        Filme fil2 = new Filme ("Toy Story", 100, "Show", "John Lasseter");
        
        assertEquals("Titulo: Pulse, Duracao: 90.0, Comentario: gostei, Artista: Pink Floyd, Faixas: 10", alb1.toString());
        assertEquals("Titulo: Abbey Road, Duracao: 50.0, Comentario: Bom, Artista: The Beatles, Faixas: 8", alb2.toString());
        
        assertEquals("Titulo: Star Wars, Duracao: 120.0, Comentario: Top, Diretor: George Lucas", fil1.toString());
        assertEquals("Titulo: Toy Story, Duracao: 100.0, Comentario: Show, Diretor: John Lasseter", fil2.toString());
        
        cat1.addItem(alb1);
        cat1.addItem(alb2);
        cat1.addItem(fil1);
        cat1.addItem(fil2);
        
        ArrayList<Item> conteudo = cat1.getItens();
        
        assertEquals(4, conteudo.size());
        
        assertEquals(alb1, conteudo.get(0));
        assertEquals(alb2, conteudo.get(1));
        assertEquals(fil1, conteudo.get(2));
        assertEquals(fil2, conteudo.get(3));
    }
}
