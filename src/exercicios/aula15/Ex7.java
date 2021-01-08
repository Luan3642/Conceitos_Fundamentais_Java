/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula15;

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o 1° número");
        int n1 = scan.nextInt();
        System.out.println("Entre com o 2° número");
        int n2 = scan.nextInt();
        System.out.println("Entre com o 3° número");
        int n3 = scan.nextInt();

        System.out.println("");
        if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + " é o maior entre eles");

            if (n2 > n3) {
                int menor = n3;
                System.out.println(menor + " é o  menor entre os números");
            } else if (n3 > n2) {
                int menor = n2;
                System.out.println(menor + " é o  menor entre os números");

            }
        }
        if (n2 > n1 && n2 > n3) {
            System.out.println(n2 + " é o maior entre eles");

            if (n1 > n3) {
                int menor = n3;
                System.out.println(menor + " é o  menor entre os números");

            }
            if (n3 > n1) {
                int menor = n1;
                System.out.println(menor + " é o  menor entre os números");

            }
        }
        if (n3 > n1 && n3 > n2) {
            System.out.println(n3 + " é o maior entre eles");

            if (n1 > n2) {
                int menor = n2;
                System.out.println(menor + " é o  menor entre os números");

            }

            if (n2 > n1) {
                int menor = n1;
                System.out.println(menor + " é o  menor entre os números");

            }

        }

    }
}
