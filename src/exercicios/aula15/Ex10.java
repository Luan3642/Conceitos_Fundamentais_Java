/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula15;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro valor:");
        int n1 = scan.nextInt();

        System.out.println("Informe o segundo valor");
        int n2 = scan.nextInt();

        System.out.println("Informe o terceiro valor");
        int n3 = scan.nextInt();

        if (n1 > n2 && n1 > n3 && n3 > n2) {
            System.out.println(n1 + " - " + n3 + " - " + n2);
        }
        if (n1 > n2 && n1 > n3 && n2 > n3) {
            System.out.println(n1 + " - " + n2 + " - " + n3);
        }

        if (n2 > n1 && n2 > n3 && n3 > n1) {
            System.out.println(n2 + " - " + n3 + " - " + n1);
        }
        if (n2 > n1 && n2 > n3 && n1 > n3) {
            System.out.println(n2 + " - " + n1 + " - " + n3);
        }

        if (n3 > n1 && n3 > n2 && n2 > n1) {
            System.out.println(n3 + " - " + n2 + " - " + n1);
        }
        if (n3 > n1 && n3 > n1 && n1 > n2) {
            System.out.println(n3 + " - " + n1 + " - " + n2);
        }
    }
}
