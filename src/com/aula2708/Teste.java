/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aula2708;


/**
 *
 * @author Rafael
 */
public class Teste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Rafael Lucio",24,1500,new Endereco("Rua 11 de Julho ",47));
        
        System.out.println("Nome:" + pessoa.getNome());
        System.out.println("Idade:" + pessoa.getIdade());
        System.out.println("Salario :R$" + pessoa.getSalario());
        System.out.println("Logradouro:"+pessoa.getEndereco().getLogradouro() + "Nº" + pessoa.getEndereco().getNumero());
        
    }
}
