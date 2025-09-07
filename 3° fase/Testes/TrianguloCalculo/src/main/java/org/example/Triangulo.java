package org.example;

public class Triangulo {
    private int ladoA;
    private int ladoB;
    private int ladoC;

    public Triangulo(int ladoA, int ladoB, int ladoC) throws Exception {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;

        validarLados(ladoA,ladoB,ladoC);

        if(verificarTriangulo(ladoA,ladoB,ladoC)){
            throw new Exception("O valor fornecidos não formam um triangulo");
        }
    }

    public int calcularPerimetro(){
        return this.ladoA + this.ladoB + this.ladoC;
    }

    private boolean verificarTriangulo(int ladoA, int ladoB, int ladoC) {
        if ((ladoA > (ladoB + ladoC)) &&
                (ladoC > (ladoB + ladoA)) &&
                (ladoB > (ladoA + ladoC))) {
            return false;
        } else {
            return true;
        }
    }

    private void validarLados(int ladoA, int ladoB, int ladoC) throws Exception {
        if(ladoA<1 || ladoB<1 || ladoC<1){
            throw new Exception("O valor fornecido é menor que 0");
        }
    }
}
