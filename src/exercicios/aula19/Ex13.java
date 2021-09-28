/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula19;

import java.util.Random;
import java.util.Scanner;


public class Ex13 {
    public static void main(String[] args) {
        
        int soma =0;
        int[] vetorA = new int[10];
        Random rd = new Random();
        
        Scanner scan = new Scanner(System.in);
        
        
        for (int i = 0; i <vetorA.length; i++) {
            System.out.println("Informe o valor " +i + " do vetor");
            vetorA[i] = scan.nextInt();
            
            if(vetorA[i] % 5 == 0)
                soma += vetorA[i];
        }
        System.out.println("");
        System.out.println("Valor do vetorA");
        for (int i : vetorA) {
            System.out.println(i);
        }
        
        
        System.out.println("Soma dos multiplos de 5: "+soma);
        
    }
}
