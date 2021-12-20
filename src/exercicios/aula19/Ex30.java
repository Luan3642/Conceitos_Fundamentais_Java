/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula19;

/**
 *
 * @author Luan
 */
public class Ex30 {

    public static void main(String[] args) {
        int[] vetorA = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorB.length];

        int qtdePar = 0, qtdeImpar = 0;

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                vetorB[qtdePar] = vetorA[i];
                qtdePar++;
            } else {
                vetorC[qtdeImpar] = vetorA[i];
                qtdeImpar++;

            }
        }

        System.out.println("Vetor B");
        for (int i = 0; i < qtdePar; i++) {
            System.out.println(vetorB[i]);
        }
        System.out.println("");
        for (int i = 0; i < qtdeImpar; i++) {
            System.out.println(vetorC[i]);
        }

    }
}
