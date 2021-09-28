/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula19;

import java.util.Random;

public class Ex12 {

    public static void main(String[] args) {
        Random rd = new Random();

        int soma = 0;
        int[] vetorA = new int[10];

        System.out.println("Valor vetorA");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = rd.nextInt(5);
            soma = soma + vetorA[i];
        }

        for (int i : vetorA) {
            System.out.println(i);
        }
        
        System.out.println("Soma: "+soma);

    }
}