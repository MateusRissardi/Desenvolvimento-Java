import org.example.Aluno;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlunoTeste {
    @Test
    public void DeveCriarAlunoCorretamente(){
        //Arrange
        String nome = "Matheus";
        String cpf = "123.456.789.10";
        //Act
        Aluno aluno = new Aluno(nome, cpf);
        //Assert
        Assertions.assertEquals("Matheus", aluno.getNome());
        Assertions.assertEquals("123.456.789.10", aluno.getCpf());
        Assertions.assertNull(aluno.getMatricula());
    }
}
