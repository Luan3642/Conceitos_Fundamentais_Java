/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula19;

import java.util.Random;



public class Ex9 {
    public static void main(String[] args) {
        double[] vetorA = new double[10];
        double[] vetorB = new double[vetorA.length];
        double[] vetorC = new double[vetorA.length];
        
        Random rd = new Random();
        
        for (int i = 0; i < 10; i++) {
            vetorA[i] = rd.nextInt(20);
        }
        
        for (int i = 0; i < 10; i++) {
            vetorB[i] = rd.nextInt(10);
        }
        
        for (int i = 0; i < 10; i++) {
            vetorC[i] = vetorA[i] / vetorB[i];
        }
        
        System.out.println("Valor vetorC");
        
        for (double d : vetorC) {
            System.out.println(d);
        }
        
    }
   
}
