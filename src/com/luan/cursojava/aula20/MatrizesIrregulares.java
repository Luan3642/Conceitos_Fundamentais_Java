/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luan.cursojava.aula20;

import java.util.Scanner;

/**
 *
 * @author Luan
 */
public class MatrizesIrregulares {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o número de pessoas que serão entrevistadas");
        int numEntrevistados = scan.nextInt();

        String[][] nomeFilhos = new String[numEntrevistados][];

        for (int i = 0; i < nomeFilhos.length; i++) {
            System.out.println("Entre com a quantidade de filhos");
            int qtdeFilhos = scan.nextInt();

            nomeFilhos[i] = new String[qtdeFilhos];

            for (int j = 0; j < nomeFilhos[i].length; j++) {
                System.out.println("Digite o nome do filho: " + (j + 1));
                nomeFilhos[i][j] = scan.next();
            }
        }

        for (int i = 0; i < nomeFilhos.length; i++) {
            System.out.println("Pessoa " + i + " tem " + nomeFilhos[i].length + " filhos ");
            for (int j = 0; j < nomeFilhos[i].length; j++) {
                System.out.println(nomeFilhos[i][j]);
            }
        }

    }
}
