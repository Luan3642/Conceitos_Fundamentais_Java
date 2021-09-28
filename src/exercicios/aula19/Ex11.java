/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula19;

import java.util.Random;
public class Ex11 {
    public static void main(String[] args) {
        Random rd = new Random();
        
        int[] vetorA = new int[10];
        int qtdePar = 0;
        
        
        System.out.println("Valor vetorA");
        for (int i = 0; i <vetorA.length; i++) {
            vetorA[i] = rd.nextInt(20);
            if(vetorA[i] % 2 == 0)
                qtdePar++;
        }
        
        for (int i : vetorA) {
            System.out.println(i);
        }
        
        System.out.println("");
        
        System.out.println("Quantidade de valores par: "+ qtdePar);
        
    }
}
