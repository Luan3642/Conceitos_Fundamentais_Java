/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula19;

import java.util.Random;

public class Ex16 {

    public static void main(String[] args) {
        int[] vetorA = new int[10];

        Random rd = new Random();
        int soma = 0;
        int igual15 = 0;
        int somaMaior15 = 0;
        double media = 0;
        int aux = 0;
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = rd.nextInt(50);
            if (vetorA[i] < 15) {
                soma += vetorA[i];
            }
            if (vetorA[i] == 15){
                igual15++;
            }
            if (vetorA[i] > 15){
                somaMaior15 += vetorA[i];
                aux++;
                media = somaMaior15 / aux;
            }
        }
        
        for (int i : vetorA) {
            System.out.println(i);
        }
        System.out.println("");
        
        
        System.out.println("Soma dos menores que 15: "+soma);
        System.out.println("Quantidade dos iguais a 15: "+igual15);
        System.out.println("Media dos maiores que 15: "+media);
    }
}
