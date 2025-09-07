import org.example.Aluno;
import org.example.SIGA;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SIGATeste {
    @Test
    public void DeveMatricularAluno(){
        //Arrange
        String nome = "Matheus";
        String cpf = "123456789";
        Aluno aluno = new Aluno(nome, cpf);
        SIGA siga = new SIGA();
        //Act
        siga.matricularAluno(aluno);
        //Assert
        String matriculaEsperada = "MAT12345";
        Assertions.assertEquals(matriculaEsperada, aluno.getMatricula());
    }
    @Test
    public void DeveMatricular2Aluno(){
        //Arrange
        String nome1 = "Matheus";
        String cpf1 = "123456789";
        String nome2 = "Paulo";
        String cpf2 = "987654321";
        Aluno aluno1 = new Aluno(nome1, cpf1);
        Aluno aluno2 = new Aluno(nome2, cpf2);
        SIGA siga = new SIGA();
        //Act
        siga.matricularAluno(aluno1);
        siga.matricularAluno(aluno2);
        //Assert
        String matriculaEsperada1 = "MAT12345";
        String matriculaEsperada2 = "PAU98765";
        Assertions.assertEquals(matriculaEsperada1, aluno1.getMatricula());
        Assertions.assertEquals(matriculaEsperada2, aluno2.getMatricula());
        Assertions.assertEquals(2, siga.buscarAlunos().size());
    }
}
