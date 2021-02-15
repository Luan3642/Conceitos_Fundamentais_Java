/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula19;

 
import java.util.Random;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        
        
        Random rd = new Random();
        
        int[] vetorA = new int[15];
        
        int[] vetorB = new int[vetorA.length];
        
        for (int i = 0; i <vetorA.length; i++) {
            vetorA[i] = rd.nextInt(50);
        }
        
        
        for (int i = 0; i <vetorB.length; i++) {
            vetorB[i] =  (int) Math.sqrt(vetorA[i]);
        }
        
        System.out.println("");
        System.out.println("Vetor A ");
        
        
        for(int i : vetorA){
            System.out.println(i);
        }
        
        System.out.println("");
        System.out.println("Vetor B");
        
        for(int j : vetorB){
            System.out.println(j);
        }
         
    }
}
