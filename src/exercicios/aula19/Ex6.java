/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula19;

import java.util.Random;

public class Ex6 {

    public static void vetores() {

        Random rd = new Random();
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        int[] vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = rd.nextInt(10);
        }

        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = rd.nextInt(10);
        }

        for (int i = 0; i < 10; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
        }

        System.out.println("Valor vetorC");

        for (int i : vetorC) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        vetores();
    }
}
