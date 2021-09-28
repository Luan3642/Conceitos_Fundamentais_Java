/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula19;

import java.util.Scanner;

public class Ex23 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o número de elementos do conjunto");
        int n = scan.nextInt();

        int[] setNumber = new int[n];
        int soma = 0;
        int media = 0;

        for (int i = 0; i < setNumber.length; i++) {
            System.out.println("Informe " + i + "° valor desse conjunto de número");
            setNumber[i] = scan.nextInt();
        }

        for (int i = 0; i < setNumber.length; i++) {
            soma += setNumber[i];
        }
        
        media = soma / n;
        

        System.out.println("Media: " + media);

    }
}
