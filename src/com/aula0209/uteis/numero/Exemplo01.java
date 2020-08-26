/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aula0209.uteis.numero;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author Rafael
 */
public class Exemplo01 {
    public static void main(String[] args) {
        float numero = (float) 1024.45;
        
        System.out.println("Numero Normal " + numero);
        System.out.println("Numero Formatado ( padrão) " + DecimalFormat.getInstance().format(numero));
        System.out.println("Numero Formatado " + new DecimalFormat("#,##0.00").format(numero));
        System.out.println("Dinheiro " + NumberFormat.getCurrencyInstance().format(numero));
    }
}
