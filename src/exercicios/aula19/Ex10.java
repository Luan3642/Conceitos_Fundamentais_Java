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
        
        Scanner scan = new Scanner(System.in);
        Random rd = new Random();
        
        int[] vetorA = new int[20];
        
        int[] vetorB = new int[vetorA.length];
        
        for (int i = 0; i <vetorA.length; i++) {
            vetorA[i] = rd.nextInt(20);
            
        }
        
        for (int i = 0; i <vetorB.length; i++) {
            vetorB[i] = vetorA[i] % 2;
        }
        
        System.out.println("");
        
        for (int i : vetorB) {
            System.out.println(i);
        }
        
     }
}
