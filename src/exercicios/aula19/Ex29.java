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
public class Ex29 {

    public static void main(String[] args) {

        int[] vetorA = {10, 2, 36, 9, 8, 7, 412, 23, 5, 9};
        int[] vetorB = {20, 3, 6, 9, 8, 4, 7, 2, 5, 4};

        int[] vetorC = new int[20];

        for (int i = 0; i < vetorA.length; i++) {
            vetorC[i] = vetorA[i];
        }
        
        for (int i =10; i < vetorC.length; i++) {
            vetorC[i] = vetorB[i - 10];
        }

        System.out.println("");
        for (int i : vetorC) {
            System.out.println(i);
        }
        
    }
}
