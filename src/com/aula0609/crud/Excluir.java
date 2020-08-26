/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aula0609.crud;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Excluir {
    
    private static Conexao conexao;
    private static Connection connection;
    private static Statement st;
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe a matricula do aluno a ser excluida");
        String matricula = ler.nextLine();
        try{
            String SQL  =  " DELETE FROM aluno WHERE matricula="+matricula;
            conexao = new Conexao();
            connection =  conexao.getConexao();
            st =  connection.createStatement();
            
            st.executeUpdate(SQL);
            
            System.out.println("Dados Excluidos com Suscesso");
            
            st.close();
        }catch(SQLException e){
            System.out.println("Erro ao Execluir");
            e.printStackTrace();
        }
        
    }
         
}
