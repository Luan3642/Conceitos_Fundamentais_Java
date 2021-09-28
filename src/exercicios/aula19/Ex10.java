/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula19;

import java.util.Random;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        
        Random rd = new Random();
     
        for (int i = 0; i <vetorA.length; i++) {
            vetorA[i] = rd.nextInt(50);
        }
        
        for (int i = 0; i <vetorB.length; i++) {
            vetorB[i] = vetorA[i] % 2;
        }
        
        System.out.println("Valor VetorB");
        
        for (int i : vetorB) {
            System.out.println(i);
        }
    }
}