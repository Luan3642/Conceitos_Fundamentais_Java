/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula19;

import java.util.Random;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int[] vetorA = new int[8];
        int[] vetorB = new int[vetorA.length];
        
        
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i <vetorA.length; i++) {
            System.out.println("Informe o valor de A");
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i] *2;
        }
        
        System.out.println("");
        System.out.println("Valor de A");
        for(int c : vetorA){
            System.out.println(c);
        }
        
        System.out.println("");
        System.out.println("Valor de B");
        
        for (int i : vetorB) {
            System.out.println(i);
        }
        
    }
    
}
///