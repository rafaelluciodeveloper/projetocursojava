/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aula0209.uteis.xml;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Exemplo04 {
    public static void main(String[] args) throws FileNotFoundException {
        XStream stream = new XStream(new DomDriver());
        stream.alias("aluno",Aluno.class);
        
        Scanner scanner = new Scanner(new FileReader("src/xml/xml_criado.xml")).useDelimiter("\\n");
        
        String lista = "";
        
        while(scanner.hasNext()){
            lista+=scanner.next();
        }
        
        List<Aluno> alunos = (List)stream.fromXML(lista);
        
        for(Aluno a :alunos){
            System.out.println(a.getNome());
            System.out.println(a.getIdade());
            System.out.println("----------------------------------");
        }
        
        
    }
}
