/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luan.cursojava.aula47;

/**
 *
 * @author Luan
 */
public class Excessao {
    public static void main(String[] args) {
        
        
        try{
            int[] vetor  = new int[4];
        
        System.out.println("Antes da exception");
        
        
        vetor[4] = 1;
        
            System.out.println("Esse texto não será impresso");
        
        }catch(ArrayIndexOutOfBoundsException e ){
            System.out.println("Não foi possível executar:");
        }
        System.out.println("Esse texto será executado após a exception");
    }
}
