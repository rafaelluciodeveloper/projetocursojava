/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aula0209;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Exemplo02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;
        int idade;
        
        System.out.println("Informe o nome");
        nome = ler.next();
        System.out.println("Informe sua idade");
        idade =  ler.nextInt();
        
        System.out.println("Nome:" + nome);
        System.out.println("Idade:"+ idade);
    }
}
