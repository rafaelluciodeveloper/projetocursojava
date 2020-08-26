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
public class Pessoa {
    private String nome;
    private int idade;
    private double salario;
    private Endereco endereco;

    public Pessoa(String nome, int idade, double salario, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.endereco = endereco;
    }

   

    public Pessoa() {
    
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
    
    
    
}
