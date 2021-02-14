/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luan.cursojava.aula18;

import java.util.Scanner;

public class Continue {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número");
        int num = scan.nextInt();

        System.out.println("Entre com um limite");
        int max = scan.nextInt();

        // não imprimindo múltiplos de 7
        
        // usamos o contínue quando estamos, usando for aninhados
        for (int i = num; i <= max; i++) {
            if (i % 7 == 0) {
                continue;
            }

            System.out.println("O primeiro múltiplo de 7, logo após esse número é: " + i);
        }

    }
}
