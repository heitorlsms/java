package com.mycompany.mysql;

import java.sql.*;

public class Mysql {

    public static void main(String[] args) {
        
        Connection conexao = null; // Inicializa a variÃ¡vel
        
        try {
            // Carrega o driver do MySQL (versÃ£o atual do driver)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Estabelece a conexÃ£o com o banco de dados
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/Restaurante", "root", "");


            ResultSet rsCliente = conexao.createStatement().executeQuery("SELECT * FROM Usuarios");

            
            while (rsCliente.next()) {
                System.out.println("ID_cliente: " + rsCliente.getInt("ID_cliente"));
                System.out.println("CPF: " + rsCliente.getString("CPF"));
                System.out.println("Nome: " + rsCliente.getString("Nome"));
                System.out.println("Username: " + rsCliente.getString("Username"));
                System.out.println("Senha: " + rsCliente.getString("Senha"));
                System.out.println("Sexo: " + rsCliente.getString("Sexo"));
                System.out.println("Idade: " + rsCliente.getString("Idade"));
                System.out.println("Endereco: " + rsCliente.getString("Endereco"));
                System.out.println("Email: " + rsCliente.getString("Email"));
                System.out.println("Telefone: " + rsCliente.getString("Telefone"));
                System.out.println("Data_cadastro: " + rsCliente.getTimestamp("Data_cadastro"));
                System.out.println("ID_filial: " + rsCliente.getInt("ID_filial"));
                System.out.println();
                System.out.println();

            }
            
            // Se a conexÃ£o for estabelecida, exibe uma mensagem
            System.out.println("Conexão estabelecida!");

        } catch (ClassNotFoundException ex) {
            System.out.println("Driver do Banco de Dados não Localizado");
        } catch (SQLException ex) {
            System.out.println("Erro ao estabelecer conexão com o Banco de Dados");
            ex.printStackTrace();
        } finally {
            if (conexao != null) {
                try {
                    // Fecha a conexÃ£o no bloco finally
                    conexao.close();
                } catch (SQLException ex) {
                    System.out.println("Erro ao fechar a conexão com o Banco de Dados");
                    ex.printStackTrace();
                }
            }
        }
    }
}
