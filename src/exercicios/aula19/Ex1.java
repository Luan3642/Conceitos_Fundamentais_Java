/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula19;


public class Ex1 {
    public static void vetores() {

        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];

        vetorA[0] = 0;
        vetorA[1] = 1;
        vetorA[2] = 2;
        vetorA[3] = 3;
        vetorA[4] = 4;

        for (int i : vetorA) {
            vetorB[i] = vetorA[i];
        }

        System.out.println("Valores do vetor B");

        for (int i : vetorB) {
            System.out.println(i);
        }


    }
    public static void main(String[] args) {
        vetores();
    }
}
