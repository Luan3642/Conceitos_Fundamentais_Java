/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula19;


import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[5];
        
        int[] vetorB = new int[vetorA.length];
        
        for (int i = 0; i <vetorA.length; i++) {
            System.out.println("Informe os valores do vetor A, POSIÇÃO: "+i);
            vetorA[i] = scan.nextInt();

            
        }
        
        
        for (int i = 0; i <vetorB.length; i++) {
            vetorB[i] = vetorA[i];
        }
        
        System.out.println("Valor do vetor A");
        
        for(int i : vetorA){
            System.out.println(i);
        }
        
        
        System.out.println("");
        
        
        System.out.println("Valor do vetor B");
        
        for(int j : vetorB){
            System.out.println(j);
        }
    }
}
