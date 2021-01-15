/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula16;

import java.util.Scanner;

/**
 *
 * @author luan3
 */
public class Ex10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um número inteiro");
        int n1 = scan.nextInt();

        System.out.println("Informe outro número inteiro");
        int n2 = scan.nextInt();

        for (int j = n1; j <=n2; j++) {
             System.out.println(j);
        }

    }
}
