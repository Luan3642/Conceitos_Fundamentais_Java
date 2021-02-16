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

        int soma = 0;
        int somaMaior15 =0;
        int iguaisA15 = 0;
        float media = 0;

        Random rd = new Random();

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = rd.nextInt(50);
            
            if(vetorA[i] < 15){
                soma += vetorA[i];
            }
            
            
            if(vetorA[i] == 15){
                iguaisA15++;
            }
            
            if(vetorA[i] > 15){
                somaMaior15 += vetorA[i];
                media = somaMaior15 / vetorA.length;
                
            }
      
        }
        System.out.println("");
        
        for (int i : vetorA) {
            System.out.println(i);
        }


        System.out.println("");

        System.out.println("A soma dos números menores que 15: " + soma);
        System.out.println("Números iguais a 15: " + iguaisA15);
        System.out.println("Média dos números: " + media);
    }
}
