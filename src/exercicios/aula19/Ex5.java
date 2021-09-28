/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula19;

import java.util.Random;

/**
 *
 * @author luan3
 */
public class Ex5 {
   public static void vetores() {
        
        Random rd = new Random();
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        
        
        for (int i = 0; i < 10; i++) {
            vetorA[i] = rd.nextInt(20);
        }
        
        
        for (int i = 0; i < 10; i++) {
            vetorB[i] = vetorA[i] * i;
        }
        
        System.out.println("Valor vetorB");
        for (int i : vetorB) {
            System.out.println(i);
        }
        
    }

    public static void main(String[] args) {
        vetores();
    }
}
