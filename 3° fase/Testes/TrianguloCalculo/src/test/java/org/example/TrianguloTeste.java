package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrianguloTeste {
    @Test
    public void deveCalcularPerimetroCorreto() throws Exception {
        //Arrange
        Triangulo tri1 = new Triangulo(3, 4, 5);
        //Act
        int perimetro = tri1.calcularPerimetro();
        //Assert
        Assertions.assertEquals(12, perimetro);
    }

    @Test
    public void deveFalharQuandoValorNaoSuficiente(){
        //Arrange
        String mensagem = "O valor fornecidos não formam um triangulo";
        //Act
        Exception exc = Assertions.assertThrows(Exception.class, () -> {new Triangulo(1,2,3);});
        //Assert
        Assertions.assertEquals(mensagem, exc.getMessage());
    }

    @Test
    public void deveFalharValorMenorQueZero(){
        String mensagem = "O valor fornecido é menor que 0";

        Exception exc = Assertions.assertThrows(Exception.class, () -> {new Triangulo(-3, 4, 7);});
        Assertions.assertEquals(mensagem, exc.getMessage());
    }
}
