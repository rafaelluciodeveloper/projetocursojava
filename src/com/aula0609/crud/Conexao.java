package com.aula0609.crud;

import java.sql.Connection;
import java.sql.DriverManager;



public class Conexao {
    
    private Connection conexao;
    
    public Conexao(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud","root","");
            System.out.println("Conexao Efetuada com Suscesso");
        }catch(Exception e){
            System.out.println("Falha Conexçao");
            e.printStackTrace();
        }
    }

    public Connection getConexao() {
        return conexao;
    }
    
}
