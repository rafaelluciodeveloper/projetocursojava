/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aula0209.uteis.data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Rafael
 */
public class Exemplo02 {

    public static void main(String[] args) {
        Date data;

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try {
            data = df.parse("14/07/1990");
            System.out.println("Data:" + data);
            System.out.println("Data:" + df.format(data));

        } catch (ParseException e) {
            System.out.println("Erro ao Converter DATA");
        }
    }
}
