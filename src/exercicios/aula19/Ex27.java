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
public class Ex27 {

    public static void main(String[] args) {
        int[] vetorA = {5, 6, 9, 71, 2, 3, 5, 54,5,10};
        int[] vetorB = {5, 6, 9, 8, 7, 1, 98, 5, 5,10};
        int[] vetorC = new int[vetorA.length];

        for (int i = 0; i <vetorA.length; i++) {
            if (vetorA[i] > vetorB[i]) {
                vetorC[i] = 1;
            } else if (vetorA[i] == vetorB[i]) {
                vetorC[i] = 0;
            } else if (vetorA[i] < vetorB[i]) {
                vetorC[i] = -1;
            }
        }
        
        for(int i : vetorC){
            System.out.println(i);
        }

    }
}
