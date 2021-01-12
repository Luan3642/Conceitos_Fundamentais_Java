/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula15;

import java.util.Scanner;

public class Ex16 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor de A");
        int valorA = scan.nextInt();

        if (valorA == 0) {
            System.out.println("Valor inválido");
        } else {

            System.out.println("Informe o valor de B");
            int valorB = scan.nextInt();

            System.out.println("Informe o valor de C");
            int valorC = scan.nextInt();

            double a = valorA;
            double b = valorB;
            double c = valorC;

            double delta = Math.pow(b, 2) - 4 * a * c;

            if (delta < 0) {
                System.out.println("O programa não possui raízes, PROGRAMA ENCERRADO");
            }

            if (delta == 0) {
                System.out.println("Possui apenas uma raíz");
            }

            if (delta > 0) {
                System.out.println("Possui duas raízes");
            }
        }
    }

}
