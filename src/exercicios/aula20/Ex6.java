/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula20;

import java.util.Scanner;

/**
 *
 * @author Luan
 */
public class Ex6 {

    public static void main(String[] args) {

        String[][] jogo = new String[3][3];

        Scanner scan = new Scanner(System.in);
        int auxLinha = 0, auxColuna = 0;

        System.out.println("Informe o nome do primeiro jogador");
        String player1 = scan.next();

        System.out.println("Informe o nome do segundo jogador");
        String player2 = scan.next();

        for (int i = 0; i < jogo.length; i++) {
            for (int j = 0; j < jogo[i].length; j++) {
                System.out.println("");

                System.out.println("Jogador " + player1 + " , jogue: X ou 0");
                String jogada = scan.next();
                System.out.println("Jogador " + player1 + " Informe a posição");
                int linha = scan.nextInt();
                int coluna = scan.nextInt();

                jogo[linha][coluna] = jogada;
                System.out.println("");
                System.out.println("Jogada: " + jogo[linha][coluna]);
                
                if (i == linha) {
                    auxLinha = i;
                }
                if (j == coluna) {
                    auxColuna = j;
                }
                System.out.println("Posição jogada: " + auxLinha + auxColuna);

            }
        }

    }
}
