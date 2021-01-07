/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula13;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int vetor[] = new int[5];

        for (int i = 1; i <vetor.length; i++) {
            System.out.println("Informe a "+i +" nota");
            vetor[i] = scan.nextInt();
        }
        
        int sum = 0;
        for(int i: vetor){
            sum += i;
        }
        System.out.println("A média é: "+ (sum  / 4));
       
    }
}
