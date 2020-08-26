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


public class Inserir {
    
    private static Conexao conexao;
    private static Connection connection;
    private static PreparedStatement ps;
    
    public static void main(String[] args) {
        try{
        Scanner ler = new Scanner(System.in);
        String SQL = "INSERT INTO aluno (nome,matricula) VALUES (?,?)";
        
        conexao = new Conexao();
        connection = conexao.getConexao();
        ps = connection.prepareStatement(SQL);
        
        Aluno a = new Aluno();
        System.out.println("INFORME O NOME DO ALUNO");
        a.setNome(ler.nextLine());
        System.out.println("INFORME A MATRICULA DO ALUNO");
        a.setMatricula(ler.nextLine());
        
        ps.setString(1,a.getNome());
        ps.setString(2,a.getMatricula());
        
        ps.executeUpdate();
        
        ps.close();
        
        System.out.println("Cadastro Inserido com Suscesso");
    }catch(SQLException e){
            System.out.println("Erro ao Inserir");
            e.printStackTrace();
    }
    
    }
}
