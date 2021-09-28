/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula19;

import java.util.Random;

public class Ex14 {
      public static void main(String[] args) {
        int[] vetorA = new int[10];
        Random rd = new Random();
        int media =0, soma = 0, qtdeImpar = 0;
        
        for (int i = 0; i < 10; i++) {
            vetorA[i] = rd.nextInt(20);
            if (vetorA[i] % 2 == 1) {
               qtdeImpar++;
               soma += vetorA[i];
               media = soma / qtdeImpar;
            }
        } 
        
        System.out.println("Vetor A");
        for (int i : vetorA) {
            System.out.println(i);
        }
        
        System.out.println("Media: "+ media);

    }
}
