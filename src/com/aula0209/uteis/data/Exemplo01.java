/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aula0209.uteis.data;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Rafael
 */
public class Exemplo01 {
    public static void main(String[] args) {
        Date dataHoje =  new Date();
        
        System.out.println(dataHoje);
        
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.println("Data:" + df.format(dataHoje));
        
        df.applyPattern("HH:mm");
        
        System.out.println("Hora:" + df.format(dataHoje));
        
    }
}
