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
public class Ex12 {
    public static void main(String[] args) {
        
        int soma = 0;
        Random rd = new Random();
        int[] vetorA = new int[10];
        
        for (int i = 0; i <vetorA.length; i++) {
            vetorA[i] = rd.nextInt(20);
            soma += vetorA[i];
            
        }
        
        for (int i : vetorA) {
            System.out.println(i);
        }
        
        System.out.println("");
        System.out.println("A soma é: " +soma);
        
        
    }
}
