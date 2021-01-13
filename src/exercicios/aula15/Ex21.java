/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula15;

import java.util.Scanner;

public class Ex21 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe quantos litros deseja abastecer");
        int litros = scan.nextInt();

        System.out.println("Informe se é alcool ou gasolina, G- gasolina, A- alcool");
        String escolha = scan.next();

        String maiusculo = escolha.toUpperCase();

        double gasolina = 2.50;
        double alcool = 1.90;

        int desconto = 0;

        if (maiusculo.equalsIgnoreCase("G")) {
            if (litros > 0 && litros <= 20) {
                desconto = 4;

                double valorPagar = gasolina * litros;
                double precoAPagar = valorPagar / (100 / desconto);

                System.out.println("Você teve um desconto de 3%, que resulta num desconto de: " + precoAPagar);

            } else {
                desconto = 6;
                double valorPagar = gasolina * litros;
                double precoAPagar = valorPagar / (100 / desconto);

                System.out.println("Você teve um desconto de 6%, que resulta num desconto de: " + precoAPagar);

            }
        } else if (maiusculo.equalsIgnoreCase("A")) {
            if (litros > 0 && litros <= 20) {
                desconto = 3;

                double valorPagar = gasolina * litros;
                double precoAPagar = valorPagar / (100 / desconto);
                System.out.println("Você teve um desconto de 3%, que resulta num desconto de: " + precoAPagar);

            } else {
                desconto = 5;

                double valorPagar = gasolina * litros;
                double precoAPagar = valorPagar / (100 / desconto);
                System.out.println("Você teve um desconto de 6%, que resulta num desconto de: " + precoAPagar);
            }
        }

    }
}
