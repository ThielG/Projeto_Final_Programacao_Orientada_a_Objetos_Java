package br.com.jp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    private static final String USER_BD = "root";
    private static final String PASWD_BD = "Senac2021";
    private static final String URL = "jdbc:mysql://localhost:3306/nursepi?useTimezone=true&serverTimezone=UTC";
    
    public static Connection abrirConexao() throws SQLException {
        
        return DriverManager.getConnection(URL, USER_BD, PASWD_BD);
    }
    
    public static void fecharConexao(Connection conexao) throws SQLException {
        if(conexao != null){
            conexao.close();
        }
    }
}
