package com.mycompany.test.mysql;

import java.sql.*;

public class Mysql {

    public static void main(String[] args) {
        
        Connection conexao = null; // Inicializa a variável
        
        try {
            // Carrega o driver do MySQL (versão atual do driver)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Estabelece a conexão com o banco de dados
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/Restaurante", "root", "");


            ResultSet rsCliente = conexao.createStatement().executeQuery("SELECT * FROM CLIENTE");
            
            while (rsCliente.next()) {
                System.out.println("Nome: " + rsCliente.getString("nome"));
            }
            
            // Se a conexão for estabelecida, exibe uma mensagem
            System.out.println("Conexão estabelecida!");

        } catch (ClassNotFoundException ex) {
            System.out.println("Driver do Banco de Dados Não Localizado");
        } catch (SQLException ex) {
            System.out.println("Erro ao estabelecer conexão com o Banco de Dados");
            ex.printStackTrace();
        } finally {
            if (conexao != null) {
                try {
                    // Fecha a conexão no bloco finally
                    conexao.close();
                } catch (SQLException ex) {
                    System.out.println("Erro ao fechar a conexão com o Banco de Dados");
                    ex.printStackTrace();
                }
            }
        }
    }
}
