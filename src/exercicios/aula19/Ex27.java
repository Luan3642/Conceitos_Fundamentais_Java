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
public class Ex27 {

    public static void main(String[] args) {
        int[] vetorA = {1,69,5,44,8,7,8,97,8,2};
        char[] vetorB = new char[10];
        
        
        
        for (int i = 0; i <vetorA.length; i++) {
            if(vetorA[i] < 7){
                vetorB[i] = 'a';
            } else if(vetorA[i] == 7){
                vetorB[i] = 'b';
            } else if (vetorA[i] > 7 && vetorA[i] < 10){
                vetorB[i] = 'c';
            } else if (vetorA[i] == 10){
                vetorB[i] = 'd';
            } else if (vetorA[i] > 10){
                vetorB[i] = 'e';
            }
        }
        
        for (char s : vetorB){
            System.out.println(s);
        }
    }
}
