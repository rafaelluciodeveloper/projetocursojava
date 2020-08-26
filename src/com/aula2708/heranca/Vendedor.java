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
public class Vendedor  extends Pessoa{
    
    String ctps;

    public Vendedor(String ctps, String nome, int idade) {
        super(nome, idade);
        this.ctps = ctps;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }
    
    
    
}
