/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula19;

import java.util.Random;

public class Ex2 {

    public static void vetores() {

        Random rd = new Random();
        //
        
        ///
        //
        int[] vetorA = new int[8];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = rd.nextInt(10);
        }

        System.out.println("");

        System.out.println("Valores vetorA");

        for (int y : vetorA) {
            System.out.println(y);
        }

        for (int v = 0; v < vetorB.length; v++) {
            vetorB[v] = vetorA[v] * 2;
        }

        System.out.println("");
        System.out.println("Valores vetorB");

        for (int b : vetorB) {
            System.out.println(b);
        }
//////////
    }

    public static void main(String[] args) {
        vetores();
    }
}
///