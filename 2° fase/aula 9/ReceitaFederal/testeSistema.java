import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
public class testeSistema
{
    @Test
    public void testeSistema(){
        Pessoas fis1 = new Fisica("ronaldo", "guaruja", "rg1", "cpf1", 1500, 2);
        Pessoas fis2 = new Fisica("gaucho", "bahia", "rg2", "cpf2", 300, 5);
        
        Pessoas jur1 = new Juridica("véio da havan", "brasil" ,"cnpj1", 10000, 3);
        Pessoas jur2 = new Juridica("luciano huck", "globo", "cnpj2", 5000, 2);
        
        ReceitaFederal rec1 = new ReceitaFederal();
        
        rec1.addPessoas(fis1);
        rec1.addPessoas(fis2);
        rec1.addPessoas(jur1);
        rec1.addPessoas(jur2);
        
        rec1.imprimirContribuintesDadosBasicos();
        rec1.imprimirContribuintesCompletos();
    }
}
