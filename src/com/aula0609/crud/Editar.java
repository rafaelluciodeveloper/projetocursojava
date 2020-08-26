/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aula0609.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Editar {
    private static Conexao conexao;
    private static Connection connection;
    private static PreparedStatement ps;
    
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        System.out.println("Informe a matricula do aluno a ser alterada"); 
        String matricula = ler.nextLine();
        
        String SQL  = "UPDATE aluno SET nome= ? WHERE matricula=?";
        try{
        conexao = new Conexao();
        connection = conexao.getConexao();
        ps = connection.prepareStatement(SQL);
            System.out.println("Informe o novo nome do aluno");
            String nome = ler.nextLine();
            ps.setString(1, nome);
            ps.setString(2, matricula);
            
            ps.executeUpdate();
            
            ps.close();
            
            System.out.println("Dados Atualizados com Suscesso");
        }catch(SQLException ex){
            System.out.println("Erro ao Editar");
            ex.printStackTrace();
        }
       
    }
}
