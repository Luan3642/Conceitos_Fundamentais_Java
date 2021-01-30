/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula16;

import java.util.Scanner;

public class Ex21 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a quantidade de turmas");
        int qtdeTurmas = scan.nextInt();

        int numAlunos = 0;
        int soma = 0;
        boolean invalido = true;

        do {
            for (int i = 1; i < qtdeTurmas; i++) {

                invalido = true;
                System.out.println("entre com o número de alunos da turma: " + i);
                numAlunos = scan.nextInt();

                if (numAlunos <=40) {
                    invalido = false;
                } else{
                    System.out.println("Número de alunos inválido digite novamente");
                }
            }

        } while (invalido);
        
        double media = soma / qtdeTurmas;
        
        
        soma += numAlunos;
        
        System.out.println("A média é: "+media);

    }
}
