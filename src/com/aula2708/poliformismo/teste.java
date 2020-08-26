/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aula2708.poliformismo;

/**
 *
 * @author Rafael
 */
public class teste {
    
    public static void chamarAndar(Animal a){
        a.andar();
    }
    
    public static void main(String[] args) {
        Animal g = new Gato();
        Animal c =  new Cachorro();
    
        chamarAndar(g);
        chamarAndar(c);
    }
}
