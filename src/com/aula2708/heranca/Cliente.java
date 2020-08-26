/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aula2708.heranca;

/**
 *
 * @author Rafael
 */
public class Cliente  extends Pessoa{
    
    String cpf;

    public Cliente(String cpf, String nome, int idade) {
        super(nome, idade);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
   
}
