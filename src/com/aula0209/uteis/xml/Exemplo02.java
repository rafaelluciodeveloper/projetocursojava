/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aula0209.uteis.xml;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

/**
 *
 * @author Rafael
 */
public class Exemplo02 {
    public static void main(String[] args) {
        XStream stream = new XStream(new DomDriver());
        
        stream.alias("aluno",Aluno.class);
        
        Aluno a = (Aluno) stream.fromXML(
            "<aluno>" 
            + "<nome>Rafael Lucio</nome>"
            + "<idade>24</idade>"
            +"</aluno>");
        
        System.out.println(a.getNome());
        System.out.println(a.getIdade());
    }
}
