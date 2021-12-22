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
public class Ex33 {

    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];

        
        for (int i = 0; i < vetorA.length; i++) {
            boolean primo = true;
            System.out.println("Digite um número");
            vetorA[i] = scan.nextInt();
            
            for (int j = 2; j <vetorA[i]; j++) {
                if(vetorA[i] % j == 0){
                    primo = false;
                }
            }
            System.out.println(primo);
            
            
            
        }

    }
}
