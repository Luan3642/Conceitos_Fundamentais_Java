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
public class Ex2 {

    public static void main(String[] args) {

        Random rd = new Random();

        System.out.println(rd.nextInt(10));

        int[] vetorA = new int[8];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = rd.nextInt(10);
        }

        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = vetorA[i] * 2;
        }

        System.out.println("");
        System.out.println("Vetor A");

        for (int i : vetorA) {
            System.out.println(i);
        }
        
        
        System.out.println("");
        System.out.println("Vetor B ");
        for(int j : vetorB){
            System.out.println(j);
        }
        

    }
}
