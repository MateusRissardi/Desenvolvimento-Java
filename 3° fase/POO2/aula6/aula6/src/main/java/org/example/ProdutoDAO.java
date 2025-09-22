package org.example;

import java.sql.*;
import java.util.ArrayList;

public class ProdutoDAO {
    public void adicionarProduto(Produto umProd) throws SQLException {
        String sql = "insert into produtos (id,nome,preco) values (?,?,?)";
        try  (Connection conn = Conexao.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, umProd.getId());
            stmt.setString(2, umProd.getNome());
            stmt.setDouble(3, umProd.getPreco());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList lerProduto() throws SQLException {
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        String sql = "SELECT * FROM produtos";
        try (Connection conn = Conexao.getConnection()){
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Produto umProd = new Produto(rs.getInt("id"), rs.getString("nome"), rs.getDouble("preco"));
                produtos.add(umProd);
            }
            return produtos;
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    public void editarProdutos(Produto umProd, String nome, double preco) throws SQLException {
        String sql = "UPDATE produtos SET nome=?, preco=? WHERE id=?";
        try(Connection conn = Conexao.getConnection() ; PreparedStatement stm = conn.prepareStatement(sql)){
            stm.setString(1, nome);
            stm.setDouble(2, preco);
            stm.setInt(3, umProd.getId());
            stm.executeUpdate();
            System.out.println("Item " + umProd.getId() + " atualizado");
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public void deletarProdutos(Produto umProd) throws SQLException{
        String sql = "DELETE FROM produtos WHERE id=?";
        try(Connection conn = Conexao.getConnection(); PreparedStatement stm = conn.prepareStatement(sql)){
            stm.setInt(1, umProd.getId());
            stm.executeUpdate();
            System.out.println("Item " + umProd.getId() + " deletado");
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public void deleteAll() throws SQLException {
        String sql = "DELETE FROM produtos";
        try(Connection conn = Conexao.getConnection(); PreparedStatement stm = conn.prepareStatement(sql)){
            stm.executeUpdate();
            System.out.println("Banco deletado");
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
