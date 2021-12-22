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
public class Ex35 {

    public static void main(String[] args) {
        int[] vetorA = {2, 3, 4, 5, 6, 7, 8};
        
        
        for (int i = 0; i <vetorA.length; i++) {
            for (int j = 1; j <=vetorA[i]; j++) {
                if(vetorA[i] % j == 0){
                    System.out.print(j + " ");
                }
            }
        }
    }
}
