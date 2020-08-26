/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aula0609.crud;


public class Aluno {
    private String nome;
    private String matricula;
    
    public Aluno(String nome , String matricula){
        this.nome =  nome;
        this.matricula = matricula;
    }
    
    public Aluno(){
        
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
