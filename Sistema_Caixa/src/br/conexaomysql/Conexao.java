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
public class Conexao {
    public static Connection conector() {
        java.sql.Connection conexao = null;
        
        try {
            String url = "jdbc:mysql://localhost:3306/caixa?user=root&password=N1ck_4rthur_s0b3r4n0";         
            conexao = DriverManager.getConnection(url);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ConexaoDAO" + e.getMessage());
        };
        
        return conexao;
    }
}
