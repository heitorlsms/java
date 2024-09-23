package com.mycompany.login.dao;
/**
 *
 * @author Carlos Santos
 */

import java.sql.Connection;
import javax.swing.JOptionPane;    


public class Conexao {
    
    public Connection conectaBD(){
        Connection conecta = null;
        
        try {
            String url = "";
            
        } cacth (Exception erro) {
            JOptionPane.showMessageDialog(parentComponent, erro.getMessage());
        }   
        return conecta;
        
    }
    
}
