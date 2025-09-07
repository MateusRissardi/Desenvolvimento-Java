package org.example;

import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "admin");
            if(connection != null){
                System.out.println("Banco de Dados conectado com sucesso!!!");
                Statement stm = connection.createStatement();
                consultaDados(stm);
            }
            else{
                System.out.println("Banco de Dados não foi conectado!!!");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void consultaDados(Statement stm) throws SQLException {
        String query = "SELECT codigo, nome from exemplo.jdbc_aluno";
        try{
            ResultSet result = stm.executeQuery(query);
            while (result.next()){
                System.out.println("id: " + result.getInt(1) + ", Nome: " + result.getString(2));
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}