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
public class Ex26 {
    public static void main(String[] args) {
        int[] vetorA = {20,1,3,6,4,8,9,10};
        int[] vetorB = new int[vetorA.length];
        
        for (int i = 0; i <vetorB.length; i++) {
            if(vetorA[i] % 2 == 0){
                vetorB[i] = 1;
            } else{
                vetorA[i] = 0;
            }
        }
        
        for(int i : vetorB){
            System.out.println(i);
        }
        
        
        
        
    }
}
