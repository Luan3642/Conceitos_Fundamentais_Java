/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luan.cursojava.aula34;

/**
 *
 * @author Luan
 */
public class TesteCalculadora {

    static int resultSoma;

    public static void main(String[] args) {

        resultSoma = MinhaCalculadora.soma(2, 3);
        
        somaDoisValores(1, 2);
        
    }

    static int somaDoisValores(int num1, int num2) {
        return MinhaCalculadora.soma(num1, num2);
    }
}
