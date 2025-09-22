package org.example;

import java.sql.SQLException;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException {
        ProdutoDAO prodDao = new ProdutoDAO();

        prodDao.deleteAll();

        Produto prod1 = new Produto(1, "Carro", 123);
        Produto prod2 = new Produto(2, "Moto", 345);
        Produto prod3 = new Produto(3, "Caminhão", 6789);

        prodDao.adicionarProduto(prod1);
        prodDao.adicionarProduto(prod2);
        prodDao.adicionarProduto(prod3);

        ArrayList<Produto> listProd = prodDao.lerProduto();

        for(Produto umProd : listProd){
            System.out.println("Id: " + umProd.getId() + ", Nome: " + umProd.getNome() + ", Preço: " + umProd.getPreco());
        }

        prodDao.editarProdutos(prod3, "aviao", 9876.0);

        listProd = prodDao.lerProduto();

        for(Produto umProd : listProd){
            System.out.println("Id: " + umProd.getId() + ", Nome: " + umProd.getNome() + ", Preço: " + umProd.getPreco());
        }
        
        prodDao.deleteAll();
    }
}