/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula16;

import java.util.Scanner;

public class Ex27 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int temperatura = 0;
        int maior = 0;
        int menor = Integer.MAX_VALUE;
        boolean resposta = false;

        do {

            System.out.println("Informe a temperatura");
            temperatura = scan.nextInt();
            
            System.out.println("Deseja continuar");
            resposta = scan.nextBoolean();

            if (temperatura > maior) {
                maior = temperatura;
            }

            if (temperatura < menor) {
                menor = temperatura;
            }

        } while (resposta != false);

        System.out.println("A maior temperatura é: " + maior);
        System.out.println("A menor temperatura é: " + menor);
    }
}
