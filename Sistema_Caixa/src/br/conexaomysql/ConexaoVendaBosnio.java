/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.conexaomysql;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author arthur
 */
public class ConexaoVendaBosnio {
    public static Connection conector() {
        java.sql.Connection con = null;
        
        try {
            String url = "jdbc:mysql://localhost:3306/prodaja?user=root&password=N1ck_4rthur_s0b3r4n0";         
            con = DriverManager.getConnection(url);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ConexaoDAO" + e.getMessage());
        };
        
        return con;
    }
}
