/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula28;

import java.util.Scanner;

/**
 *
 * @author Luan
 */
public class JogoVelha {

    private boolean ganhador;
    private int jogador = 1;
    private char sinal;
    private char tabuleiro[][];
    private int linha = 0;
    private int coluna = 0;

    Scanner scan = new Scanner(System.in);

    public JogoVelha() {
        tabuleiro = new char[3][3];
    }

    public void jogadada() {
        while (!ganhador) {

            if (jogador % 2 == 1) {
                System.out.println("Vez do 1º jogador, escolha sua jogada");
                sinal = 'X';
            } else {
                System.out.println("Vez do 2º jogador, escolha sua jogada");
                sinal = 'O';
            }

            boolean linhaValida = false;

            while (!linhaValida) {
                System.out.println("Entre com a linha, entre 1 e 3");
                linha = scan.nextInt();
                if (linha >= 1 && linha <= 3) {
                    linhaValida = true;
                } else {
                    System.out.println("Linha inválida, tente novamente, entre 1 e 3");
                }
            }

            boolean colunaValida = false;

            while (!colunaValida) {
                System.out.println("Entre com a coluna, entre 1 e 3");
                coluna = scan.nextInt();
                if (coluna >= 1 && coluna <= 3) {
                    colunaValida = true;
                } else {
                    System.out.println("Coluna inválida, tente novamente");
                }
            }

            linha--;
            coluna--;

            if (tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna] == 'O') {
                System.out.println("Posição já usada, tente novamente");
            } else {
                tabuleiro[linha][coluna] = sinal;
                jogador++;
            }

            for (int i = 0; i < tabuleiro.length; i++) {
                for (int j = 0; j < tabuleiro[i].length; j++) {
                    System.out.print(tabuleiro[i][j] + " | ");
                }
                System.out.println("");
            }
            verificaGanhador();
        }
    }

    public void verificaGanhador() {
        if ((tabuleiro[0][0] == 'X' && tabuleiro[0][1] == 'X' && tabuleiro[0][2] == 'X')
                || (tabuleiro[1][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[1][2] == 'X')
                || (tabuleiro[2][0] == 'X' && tabuleiro[2][1] == 'X' && tabuleiro[2][2] == 'X')
                || (tabuleiro[0][0] == 'X' && tabuleiro[1][0] == 'X' && tabuleiro[2][0] == 'X')
                || (tabuleiro[0][1] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][1] == 'X')
                || (tabuleiro[0][2] == 'X' && tabuleiro[1][2] == 'X' && tabuleiro[2][2] == 'X')
                || (tabuleiro[0][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][2] == 'X')) {

            ganhador = true;
            System.out.println("Parabéns, jogador 1 ganhou  ");

        } else {
            if ((tabuleiro[0][0] == 'O' && tabuleiro[0][1] == 'O' && tabuleiro[0][2] == 'O')
                    || (tabuleiro[1][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[1][2] == 'O')
                    || (tabuleiro[2][0] == 'O' && tabuleiro[2][1] == 'O' && tabuleiro[2][2] == 'O')
                    || (tabuleiro[0][0] == 'O' && tabuleiro[1][0] == 'O' && tabuleiro[2][0] == 'O')
                    || (tabuleiro[0][1] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][1] == 'O')
                    || (tabuleiro[0][2] == 'O' && tabuleiro[1][2] == 'O' && tabuleiro[2][2] == 'O')
                    || (tabuleiro[0][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][2] == 'O')) {

                ganhador = true;
                System.out.println("Parabéns, jogador 2 ganhou  ");

            } else if (jogador > 9) {
                ganhador = true;
                System.out.println("Ninguém ganhou essa partida");
            }
        }
    }

}
