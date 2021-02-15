/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula19;

import java.util.Random;

public class Ex14 {
    public static void main(String[] args) {
        
        Random rd = new Random();
        int[] vetorA = new int[10];
        
        int soma = 0;
        float media = 0;
        
        for (int i = 0; i <vetorA.length; i++) {
            vetorA[i] = rd.nextInt(10);
            if(vetorA[i] % 2 == 1){
                soma += vetorA[i];
                
                media = soma / vetorA.length;
            }
            
        }
        
        for (int i : vetorA) {
            System.out.println(i);
        }
        
        System.out.println("");
        System.out.println("A média é: "+media);
        
    }
}
