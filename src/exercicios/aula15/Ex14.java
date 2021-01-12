/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula15;

import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a 1° nota");
        int n1 = scan.nextInt();

        System.out.println("Informe a 2° nota");
        int n2 = scan.nextInt();

        double media = (n1 + n2) / 2;

        if (media <= 9 && media >= 10) {
            System.out.println("Sua média: " + media);
            System.out.println("Seu conceito: A ");
            System.out.println("APROVADO");
        } else if (media > 7.5 && media < 9) {
            System.out.println("Sua média: " + media);
            System.out.println("Seu conceito: B ");
            System.out.println("APROVADO");
        } else if (media > 4 && media < 6) {
            System.out.println("Sua média: " + media);
            System.out.println("Seu conceito: D ");
            System.out.println("REPROVADO");
        } else if (media >=0 && media < 4) {
            System.out.println("Sua média: " + media);
            System.out.println("Seu conceito: E ");
            System.out.println("REPROVADO");
        }
    }

}
