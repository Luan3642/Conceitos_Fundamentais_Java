/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula19;

import java.util.Random;

public class Ex15 {

   public static void main(String[] args) {
        int[] vetorA = new int[10];
        
        Random rd = new Random();
        
        int impar = 0;
        
        for (int i = 0; i <vetorA.length; i++) {
            vetorA[i] = rd.nextInt(20);
            if(vetorA[i] % 2 != 0)
                impar++; 
        }
        
        for(int i : vetorA){
            System.out.println(i);
        }
        
        int par = vetorA.length - impar ;
        
        int porcentagemPar = (par * 100) / vetorA.length;
        int porcentagemImpar = 100 - porcentagemPar; 
        
        System.out.println("Porcentagem pares: "+porcentagemPar +"%");
        System.out.println("Porcentagem impares: "+porcentagemImpar +"%");
    }
}
