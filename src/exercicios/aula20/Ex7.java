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
public class Ex7 {

    public static void main(String[] args) {
        String[][] nomes = new String[3][3];
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a posicao");
        int linha = scan.nextInt();
        int coluna = scan.nextInt();
        
        int auxLinha = 0;
        int auxColuna = 0;
        
        nomes[linha][coluna] = "marcos";
        
        for (int i = 0; i <nomes.length; i++) {
            for (int j = 0; j <nomes[i].length; j++) {
                if(i == linha){
                    auxLinha = i;
                }
                if(j == coluna ){
                    auxColuna = j;
                }
            }
        }
        
        System.out.println("Linha: "+ auxLinha + " coluna: " + auxColuna);
    }
}
