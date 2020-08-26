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
public class Exemplo03 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Teste");
        
        JOptionPane.showMessageDialog(null,"Mensagem","Titulo",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Mensagem","Titulo",JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null,"Mensagem","Titulo",JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null,"Mensagem","Titulo",JOptionPane.QUESTION_MESSAGE);
        
    }
   
}
