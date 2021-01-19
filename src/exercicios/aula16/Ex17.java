/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula16;

import java.util.Scanner;

public class Ex17 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o número que deseja saber o fatorial");
        int n = scan.nextInt();

        int valorInicial = 0;
        int valorAtualizado = 0;
        int fatorial = 0;

        if (n <= 1) {
            System.out.println(1);
        } else {
            for (int i = n; i >= 1; i--) {
                valorInicial = i; // (5) 1 execucao
                if (valorAtualizado == 1) {
                    valorAtualizado = 1; // (4) 1 execucao
                } else {
                    valorAtualizado = i - 1; // (4) 1 execucao
                }
                if (i >=n) {
                    fatorial = valorInicial * valorAtualizado; // (5 * 4 = 20) 1 execucao
                } else {
                    fatorial = fatorial * valorAtualizado;
                }
            }
            System.out.println(fatorial);
        }

    }
}
