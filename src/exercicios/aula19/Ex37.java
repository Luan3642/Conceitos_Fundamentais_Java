/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula19;

/**
 *
 * @author Luan
 */
public class Ex37 {
    
    public static void main(String[] args) {
        int[] vetorA = {3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        
        int k = 0;
        for (int i = 0; i < vetorA.length; i++) {
            k = vetorA[i];
            for (int j = vetorA[i]; j >= 2; j--) {
                    k *= (j - 1);
                }
                System.out.println("fatorial de " + vetorA[i] + "!" + " = " + k);
            }
        }
        
    }
