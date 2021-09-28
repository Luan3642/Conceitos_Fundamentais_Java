/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula19;

import java.util.Random;

public class Ex3 {

    public static void vetores() {

        Random rd = new Random();

        int[] vetorA = new int[15];
        int[] vetorB = new int[vetorA.length];

        for (int s = 0; s < vetorA.length; s++) {
            vetorA[s] = rd.nextInt(10);
        }

        System.out.println("Vetor A");

        for (int i : vetorA) {
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            vetorB[i] = (int) Math.pow(vetorA[i], 2);
        }

        System.out.println("");

        for (int i : vetorB) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        vetores();
    }
}
