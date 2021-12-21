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
public class Ex32 {
    public static void main(String[] args) {
        int[] vetorA = {5,6,2,3,4};
        
        for (int i = 0; i <vetorA.length; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(vetorA[i] +" * "+ j + " = " + vetorA[i] * j);
            }
        }
        
    }
}
