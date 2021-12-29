/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula20;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Luan
 */
public class Ex1 {

    public static void main(String[] args) {
        int[][] m = {{5,69,81,2}, {6,14,2,58}, {6,9,8,7,14,50}, {569,21,23,1}};

        int maior = Integer.MIN_VALUE;
        Random rd = new Random();
        int linha = 0;
        int coluna = 0;
        
        for (int i = 0; i <m.length; i++) {
            for (int j = 0; j <m[i].length; j++) {
                if(m[i][j] > maior){
                    maior = m[i][j];
                    linha = i;
                    coluna = j;
                }
            }
            
        }
       
        
         for (int i = 0; i <m.length; i++) {
            for (int j = 0; j <m[i].length; j++) {
                System.out.print(m[i][j] + " - ");
            }
             System.out.println("");
        }
         
         System.out.println("O maior é: "+maior);
         System.out.print("Linha: "+ linha);
         System.out.println("Coluna: "+ coluna);

    }
}
