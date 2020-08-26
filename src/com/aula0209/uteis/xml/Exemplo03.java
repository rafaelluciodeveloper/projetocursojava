/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aula0209.uteis.xml;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class Exemplo03 {
    public static void main(String[] args) {
        List alunos  = new ArrayList();
        alunos.add(new Aluno("Rafael", 24));
        alunos.add(new Aluno("Jullyana", 21));
        alunos.add(new Aluno("Rodrigo", 20));
        
        XStream stream = new XStream(new DomDriver());
        stream.alias("aluno",Aluno.class);
        stream.alias("ListaAlunos",List.class);
        System.out.println(stream.toXML(alunos));
    }
}
