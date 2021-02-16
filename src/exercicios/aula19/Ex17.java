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
public class Ex17 {
    public static void main(String[] args) {
        Random rd = new Random();
        
        int[] vetorA = new int[10];
        int idade35 = 0;
        
        for (int i = 0; i <vetorA.length; i++) {
            vetorA[i] = rd.nextInt(50);
            
            if(vetorA[i] > 35){
                idade35++;
            }
        }
        
        for (int i : vetorA) {
            System.out.println(i);
        }
        
        System.out.println("Idade maior que 35: "+idade35);
    }
}
