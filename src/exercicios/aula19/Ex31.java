/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula19;

/**
 *
 * @author Luan
 */
public class Ex31 {
    public static void main(String[] args) {
        
        
        int[] vetorA = {1,2,3,4,5,6,9,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int[] vetorB = new int[vetorA.length];
        
        
        int posB = 0;
        
       
        
        for (int i = 0; i <vetorA.length; i++) {
            if(vetorA[i] % 2 != 0){
                vetorB[posB] = vetorA[i];
                posB++;
            }
        }
        
        
         for (int i = 0; i < vetorA.length; i++) {
            if(vetorA[i] % 2 == 0){
                vetorB[posB] = vetorA[i];
                posB++;
            }
        }
        
        for (int i = 0; i <posB; i++) {
            System.out.print(vetorB[i] +" ");
        }
        
    }
}
