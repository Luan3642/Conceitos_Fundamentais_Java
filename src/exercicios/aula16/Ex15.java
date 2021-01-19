/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula16;

import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número para delimitar a sequência de fibonacci");
        int numero = scan.nextInt();

        int primeiroNumero = 1;
        int segundoNumero = 1;
        int proximo;
        
        System.out.println(primeiroNumero);
        System.out.println(segundoNumero);

        for (int i = 3; i <=numero; i++) {
            proximo = primeiroNumero + segundoNumero;
            primeiroNumero = segundoNumero;
            segundoNumero = proximo;

            System.out.println(proximo);

        }

    }

}
