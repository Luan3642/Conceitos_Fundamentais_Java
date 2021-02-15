/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula19;

import java.util.Random;

public class Ex15 {

    public static void main(String[] args) {

        Random rd = new Random();

        int pares = 0;
        int impares = 0;
 

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = rd.nextInt(20);

            if (vetorA[i] % 2 != 0) {
                impares++;
            } 
        }
        
        System.out.println("");
        for (int i : vetorA) {
            System.out.println(i);
        }
        
        System.out.println("");
        
        int par = vetorA.length - impares;
        
        // vetorA.length --- 100%
        // par           --- x
        // x . vetorA.legth = par * 100
        // x == (par * 100) / vetor.length
        
        int porcPares = (par * 100) / vetorA.length;
        int porcImpares = 100 - porcPares;
        
        
        System.out.println("Porcentagem pares: "+porcPares +"%");
        System.out.println("Porcentagem impares: "+porcImpares +"%");
 

    }
}
