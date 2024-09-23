package com.mycompany.login.dao;
/**
 * @author Carlos Santos
 */

import java.sql.Connection;  
import java.sql.DriverManager;

public class LoginDAO {
    
     public Connection getConnection(){
         Connection conexao = DriverManager.getConnection();
     }
    
}
