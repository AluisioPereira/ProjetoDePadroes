/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.joseifpb.indekos.conexao;

/**
 *
 * @author José
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conexao {

    private static Connection conn = null;

    private static PreparedStatement stm = null;

    public static Connection abrirConexao() throws ClassNotFoundException, SQLException {
        return abrirConexaoBanco("localhost", "nomeDoBD", "postgres", "16101990");
    }

    public static Connection abrirConexaoBanco(String server, String dataBase, String user, String password) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        conn = DriverManager.getConnection("jdbc:postgresql://" + server + ":5432/" + dataBase, user, password);
        return conn;
    }

    public static void fecharConexao(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }

    public static PreparedStatement abrirStatement(String sql) {

        try {
            stm = conn.prepareStatement(sql);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return stm;
    }

    public static boolean fecharStatment(PreparedStatement stm) {
        if (stm != null)//Obs.: N�o sei o que o PreparedStatement retorna
        {
            try {
                stm.close();
                return true;
            } catch (SQLException e) {
                System.err.println("Erro: " + e.getMessage());
                e.printStackTrace();
            }
        }

        return false;
    }

}
