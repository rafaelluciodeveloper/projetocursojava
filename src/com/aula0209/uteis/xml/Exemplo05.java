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
public class Exemplo05 {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Rafael",new Endereco("Rua 11 de Julho", 47));
        
        XStream stream = new XStream(new DomDriver());
        stream.alias("Funcionario", Pessoa.class);
        System.out.println(stream.toXML(p));
        
    }
}
