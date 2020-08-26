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
public class Exemplo01 {
    public static void main(String[] args) {
        Aluno a = new Aluno("Rafael",24);
        
        XStream stream = new XStream(new DomDriver());
        System.out.println(stream.toXML(a));
    }
}
