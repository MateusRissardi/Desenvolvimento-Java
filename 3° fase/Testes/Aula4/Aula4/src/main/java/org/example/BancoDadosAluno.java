
package org.example;

import org.example.Aluno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author matth
 */
public class BancoDadosAluno extends RepositorioAluno {
       
    private static void createTable() {
        Connection connection = Conexao.getConnection();
        String sqlCreate = "CREATE TABLE IF NOT EXISTS ALUNO"
                + "   (id            INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "   nome           VARCHAR(255)),";

        try {
            Statement stmt = connection.createStatement();
            stmt.execute(sqlCreate);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public boolean gravarAluno(Aluno aluno) {
        createTable();
        Connection connection = Conexao.getConnection();
        String sql = "INSERT INTO ALUNO (nome) VALUES(?)";
        PreparedStatement pstmt;

        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, aluno.getNome());
            pstmt.execute();
            System.out.println("Aluno gravado com sucesso!");
            return true;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
}

