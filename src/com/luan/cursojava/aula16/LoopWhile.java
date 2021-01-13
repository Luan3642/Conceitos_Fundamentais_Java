/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luan.cursojava.aula16;

/**
 *
 * @author luan3
 */
public class LoopWhile {

    public static void main(String[] args) {

        int i = 0;
        int max = 10;

        System.out.println("Contando até: " + max);

        while (i < max) {

            i++;

            System.out.println(i);
        }
        System.out.println("");
        System.out.println(i);

        do {
            i++;
            System.out.println("Valor de i: " + i);
        } while (i < 12);
        
        
        System.out.println("Valor de i: "+i);
    }
    
    
}
