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
public class teste {
    public static void main(String[] args) {
        Cliente c = new Cliente("087.381.794-07", "Rafael Lucio", 24);
        Vendedor v = new Vendedor("1234567", "Thiago Medeiros", 31);
        
        
        System.out.println("Cliente");
        System.out.println("-----------------------------------");
        System.out.println(c.getNome());
        System.out.println(c.getCpf());
        System.out.println(c.getIdade());
        System.out.println("Vendedor");
        System.out.println("-----------------------------------");
        System.out.println(v.getNome());
        System.out.println(v.getCtps());
        System.out.println(v.getIdade());

    }
}
