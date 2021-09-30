/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula19;

import java.util.Random;
import java.util.Scanner;

import java.util.Scanner;

public class Ex18 {

    public static void main(String[] args) {
        int[] vetorA = new int[10];

        Random rd = new Random();

        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int posicaoMenor = 0;
        int posicaoMaior = 0;

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = rd.nextInt(20);

            if (vetorA[i] < menor) {
                menor = vetorA[i];
                posicaoMenor = i;
            } else if (vetorA[i] > maior) {
                maior = vetorA[i];
                posicaoMaior = i;
            }

        }

        for (int i : vetorA) {
            System.out.println(i);
        }

        System.out.println("");
        System.out.println("Menor número: " + menor);
        System.out.println("Posicao menor: " + posicaoMenor);
        System.out.println("Maior número: " + maior);
        System.out.println("Posição maior: "+ posicaoMaior);
    }

}
