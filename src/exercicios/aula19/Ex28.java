/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula19;

import java.util.Scanner;

/**
 *
 * @author Luan
 */
public class Ex28 {

    public static void main(String[] args) {

        int[] vetorA = {2,5,9,8,10,3,6,9};
        int[] vetorB = new int[vetorA.length];
     
        
        for(int i = 0; i < vetorA.length; i++){
            vetorB[(vetorA.length - 1) - i] = vetorA[i];
        }
        
        for (int i : vetorB) {
            System.out.println(i);
        }
    }
    
}
