/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aula0209.uteis.texto;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Rafael
 */
public class Exemplo03 {

    public static void main(String[] args) {
        try {
            FileWriter arquivo = new FileWriter("src/texto/texto_criado.txt");
            PrintWriter gravador = new PrintWriter(arquivo);

            for (int i = 0; i < 99; i++) {
                gravador.println(i);
            }
            arquivo.close();
        } catch (IOException e) {
            System.out.println("Erro ao Gravar Arquivo");
        }
    }
}
