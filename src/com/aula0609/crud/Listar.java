/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aula0609.crud;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Rafael
 */
public class Listar {
    private static Conexao conexao;
    private static Connection connection;
    private static ResultSet rs;
    private static Statement st;
    
    public static void main(String[] args) {
        String SQL = "SELECT * FROM aluno";
        try{
        conexao = new Conexao();
        connection = conexao.getConexao();
        st = connection.createStatement();
        
        rs = st.executeQuery(SQL);
        
        while(rs.next()){
            System.out.println("Matricula :"+rs.getString("matricula"));
            System.out.println("Nome:"+rs.getString("nome"));
            System.out.println("--------------------------------");
        }
        
        
        }catch(SQLException ex){
            System.out.println("Erro ao Listar");
            ex.printStackTrace();
    }
    
}
    
}
