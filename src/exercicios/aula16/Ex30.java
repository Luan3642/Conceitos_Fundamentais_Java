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
public class Ex30 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número pra saber a sua tabuada");
        int numeroTabuada = scan.nextInt();

        System.out.println("Informe o valor inicial");
        int numeroInicial = scan.nextInt();

        System.out.println("Informe o valor final");
        int numeroFinal = scan.nextInt();

        System.out.println("");
        System.out.println("Montar tabuada do: " + numeroTabuada);

        System.out.println("");
        System.out.println("Começar por: " + numeroInicial);
        System.out.println("Terminar em: " + numeroFinal);

        System.out.println("");
        for (int j = numeroInicial; j <=numeroFinal; j++) {
            System.out.println(numeroTabuada + " * " + j + " = " + numeroInicial * j);
        }
    }

}
