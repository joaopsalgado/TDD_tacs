/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inf.ufg.exerciciotdd;


/**
 *
 * @author João Pedro Salgado
 */
public class AnoBisexto {

    public String VerificaAno(int ano) {

        if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
            return "ANO BISEXTO";
        } else {
            return "ANO NAO BISEXTO";
        }

    }
}

