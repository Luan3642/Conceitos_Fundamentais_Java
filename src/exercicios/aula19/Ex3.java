/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula19;

import java.util.Random;


public class Ex3 {

    public static void main(String[] args) {
        int[] vetorA = new int[15];
        int[] vetorB = new int[vetorA.length];
        
        Random rd = new Random();
        
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = rd.nextInt(10);
            vetorB[i] = (int)Math.pow(vetorA[i],2 );
        }
        
        System.out.println("Vetor A");
        for(int xc : vetorA){
            System.out.println(xc);
        }
        System.out.println("");
        System.out.println("Vetor B");
        for (int i : vetorB) {
            System.out.println(i);
        }
    }
}
