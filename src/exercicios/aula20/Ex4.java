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
public class Ex4 {

    public static void main(String[] args) {
//        int[][] agenda = new int [30][24];
        String[][] compromissos = new String[30][24];

        Scanner scan = new Scanner(System.in);

        System.out.println("-------------------------------Menu-------------------------------");
        System.out.print("Day: 1 ");
        System.out.print(", 2 ");
        System.out.print(", 3 \n");
        System.out.print("     4 ");
        System.out.print(", 5 ");
        System.out.print(", 6 \n");
        System.out.print("     7 ");
        System.out.print(", 8 ");
        System.out.print(", 9 \n ");
        System.out.print("    10 ");
        System.out.print(", 11 ");
        System.out.print(", 12 \n ");
        System.out.print("    13 ");
        System.out.print(", 14 ");
        System.out.print(", 15 \n");
        System.out.print("     16 ");
        System.out.print(", 17 ");
        System.out.print(", 18 \n ");
        System.out.print("    19 ");
        System.out.print(", 20 ");
        System.out.print(", 21 \n ");
        System.out.print("    22 ");
        System.out.print(", 23 ");
        System.out.print(", 24 \n");
        System.out.print("     25 ");
        System.out.print(", 26 ");
        System.out.print(", 27 \n ");
        System.out.print("    28 ");
        System.out.print(", 29 ");
        System.out.print(", 30 \n");
        int dia = scan.nextInt();

        int aux = 0;
        switch (dia) {
            case 1:

                System.out.println("Informe o horário do compromisso");
                int horario = scan.nextInt();

                System.out.println("Informe a tarefa que deseja armazenar");
                compromissos[0 + 1][horario] = scan.next();
        }

        System.out.println("");
        System.out.println("Informe o dia que deseja pesquisar");
        int diaPesquisa = scan.nextInt();

        System.out.println("informe a hora que deseja pesquisar");
        int horaPesquisa = scan.nextInt();

        System.out.println("");
        System.out.println("Tarefa: " + compromissos[diaPesquisa][horaPesquisa]);
        for (int i = 0; i < compromissos.length; i++) {
            for (int j = 0; j < compromissos[i].length; j++) {
                if (j == horaPesquisa) {
                    aux = j;

                }

            }
        }
        System.out.println("Horário: " + aux);

    }

}
