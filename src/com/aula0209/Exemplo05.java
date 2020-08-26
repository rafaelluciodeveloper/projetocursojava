/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aula0209;

import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
public class Exemplo05 {
    public static void main(String[] args) {
        JOptionPane.showInputDialog("Informe Seu nome");
        
        JOptionPane.showInputDialog(null,"Informe Seu nome","titulo",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showInputDialog(null,"Informe Seu nome","titulo",JOptionPane.ERROR_MESSAGE);
        JOptionPane.showInputDialog(null,"Informe Seu nome","titulo",JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showInputDialog(null,"Informe Seu nome","titulo",JOptionPane.WARNING_MESSAGE);
        
        String nome = JOptionPane.showInputDialog("Informe Seu nome");
        
        JOptionPane.showMessageDialog(null,nome);
    }
}
