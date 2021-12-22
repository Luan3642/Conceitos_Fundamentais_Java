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
public class Ex34 {
    public static void main(String[] args) {
        int[] vetorA = {20,10,5,6,9,4,5,6,7,50};
        
        for (int i = 0; i <vetorA.length; i++) {
            for (int j = 0; j <=vetorA[i]; j++) {
                if(j % 2 == 0){
                    System.out.print(" " + j);
                }
            }
        }
        
        
    }
}
