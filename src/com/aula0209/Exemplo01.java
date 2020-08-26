/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aula0209;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Rafael
 */
public class Exemplo01 {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nome = "";
        int idade=0;
            System.out.println("Informe seu Nome"); 
           try{
               nome = br.readLine();
           }catch(IOException e){
               System.out.println("Erro Ao Salvar Nome!!!");
            }
           System.out.println("Informe sua idade");
           
           try{
              idade = Integer.parseInt(br.readLine());
           }catch (NumberFormatException e){
               System.out.println("Erro ao Converter");
           }catch (IOException e){
               System.out.println("Erro ao Gravar.");
           }finally{
               System.out.println("Finalizado");
           }
           
           System.out.println("Nome" + nome);
           System.out.println("Idade"+ idade);
    }
}
