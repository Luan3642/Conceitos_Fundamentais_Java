/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula19;

import java.util.Random;

/**
 *
 * @author luan3
 */
public class Ex13 {
    public static void main(String[] args) {
        
        Random rd = new Random();
        
        int soma = 0;
        
        int[] vetorA = new int[10];
        
        for (int i = 0; i <vetorA.length; i++) {
            vetorA[i] = rd.nextInt(20);
            
            if(vetorA[i] % 5 == 0){
                soma += vetorA[i];
            }
        }
        
        for (int i : vetorA) {
            System.out.println(i);
        }
        
        System.out.println("");
        
        System.out.println("Soma: "+soma);
    }
}
