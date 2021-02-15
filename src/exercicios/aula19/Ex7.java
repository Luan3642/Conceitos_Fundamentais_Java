/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula19;


import java.util.Random;

public class Ex7 {
    public static void main(String[] args) {
        
        Random rd = new Random();
        
        int vetorA[] = new int [10];
        
        int vetorB[] = new int [vetorA.length];
        
        int vetorC[] = new int[vetorA.length];
        
        for (int i = 0; i <vetorA.length; i++) {
            vetorA[i] = rd.nextInt(10);
        }
        
        for (int i = 0; i <vetorB.length; i++) {
            vetorB[i] = rd.nextInt(10);
        }
        
        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = vetorA[i] - vetorB[i];
        }
        
        
       for(int i : vetorC){
           System.out.println(i);
       }
        
        
    }
}
