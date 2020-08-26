/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aula0209.uteis.string;

/**
 *
 * @author Rafael
 */
public class Exemplo01 {
    public static void main(String[] args) {
        String nome = "Rafael";
        System.out.println("Tamanho:" + nome.length());
        
        System.out.println("Caracter Especifico:" + nome.charAt(0));
        System.out.println("Caracter Especifico:" + nome.charAt(5));
        
        for(int i = 0;i<nome.length();i++){
            System.out.println(nome.charAt(i));
        }
        System.out.println("Parte Especifica"+ nome.substring(1));
        System.out.println("Parte Especifica " + nome.substring(0,3));
        
        
        System.out.println("Maiscula"+nome.toUpperCase());
        System.out.println("Minuscula" + nome.toLowerCase());
        
        System.out.println("Capitalizada"+ Character.toUpperCase(0) + nome.substring(1).toLowerCase());
        
        System.out.println("Concatenação:"+nome.concat("e Aluno"));
        
        if (nome.indexOf("a")>= 0){
            System.out.println("Letra Encontrada");
        }else{
            System.out.println("Letra Nao Encontrada");
        }
    }
}
