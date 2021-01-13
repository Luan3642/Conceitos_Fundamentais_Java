/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luan.cursojava.aula17;

/**
 *
 * @author luan3
 */
public class For {

    public static void main(String[] args) {

        // for de incremento
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println("");

        //for de decremento
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("");

        // for com mais de uma variável
        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i = " + i + "; j = " + j);
        }

        System.out.println("");

        // for com partes ausentes
        int count = 0;
        for (; count < 10;) {
            System.out.println("valor de count: " + count);
            count += 2;

        }

        System.out.println("");

        //for com step
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }

        //for infinito 
//        for(;;);
        System.out.println("");
        //loop sem corpo
        int soma = 0;
        for (int i = 1; i < 5; soma += i++);
        System.out.println("O valor da soma é: " + soma);

    }
}
