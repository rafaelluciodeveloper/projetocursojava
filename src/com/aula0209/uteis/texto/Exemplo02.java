/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aula0209.uteis.texto;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Exemplo02 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader("src/texto/texto.txt")).useDelimiter("\\||\\n");
        
        while(scanner.hasNext()){
            String nome = scanner.next();
            String curso = scanner.next();
            String idade = scanner.next();
            
            System.out.println(nome);
            System.out.println(curso);
            System.out.println(idade);
            System.out.println("------------------------------------------------------");
        }
    }
}
