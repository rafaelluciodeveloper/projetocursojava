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
public class Exemplo04 {
    public static void main(String[] args) {
        JOptionPane.showConfirmDialog(null,"Qual e a peergunta ?");
        
        JOptionPane.showConfirmDialog(null,"Qual e a peergunta ?" ,"Titulo",JOptionPane.OK_CANCEL_OPTION);
        JOptionPane.showConfirmDialog(null,"Qual e a pergunta ?","Titulo",JOptionPane.YES_NO_OPTION);
        JOptionPane.showConfirmDialog(null,"PErgunta","Titulo",JOptionPane.YES_NO_CANCEL_OPTION);
        
        JOptionPane.showConfirmDialog(null,"Pergunta","Titulo",JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showConfirmDialog(null,"Pergunta","Titulo",JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
        JOptionPane.showConfirmDialog(null,"Pergunta","Titulo",JOptionPane.OK_CANCEL_OPTION,JOptionPane.ERROR_MESSAGE);
        JOptionPane.showConfirmDialog(null,"Pergunta","Titulo",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        
        System.out.println(JOptionPane.OK_OPTION);
        System.out.println(JOptionPane.CANCEL_OPTION);
        System.out.println(JOptionPane.YES_OPTION);
        System.out.println(JOptionPane.NO_OPTION);
        
        System.out.println("-------------------------------------------------------");
        
        int resposta = JOptionPane.showConfirmDialog(null,"Qual a Reposta ?");
        
        System.out.println(resposta);
        

        
    }
}
