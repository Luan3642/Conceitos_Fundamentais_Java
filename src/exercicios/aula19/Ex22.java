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
public class Ex22 {

    
    public static void main(String[] args) {
        
        int[] vetorA = new int[10];
        int zero = 0;
        
        for (int i = 0; i <vetorA.length; i++) {
            vetorA[i] = (int)Math.round(Math.random() * 1);
            
            if(vetorA[i] == 0){
                zero++;
            }
            
        }
//        

        for (int i : vetorA) {
            System.out.println(i);
        }
        
        System.out.println("");
        int one = vetorA.length - zero;
        
        int porcentagemOne = (one * 100) / vetorA.length;
        int porcentagemZero = 100 - porcentagemOne;
        
        
        System.out.println("Números 1: "+ porcentagemOne +"%");
        System.out.println("Números 0: "+porcentagemZero +"%");
    }
}
