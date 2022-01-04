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
public class Ex5 {

    public static String compromisso[][][] = new String[13][32][25];

    public void agendarCompromisso(int mes, int dia, int hora, String tarefa) {
        for (int i = 0; i < compromisso.length; i++) {
            for (int j = 0; j < compromisso[i].length; j++) {
                for (int k = 0; k < compromisso[i][j].length; k++) {
                    if (k <= 8) {
                        compromisso[mes][dia][hora] = tarefa;
                    } else {
                        break;
                    }
                }
            }
        }

    }

    public String pesquisarCompromisso(int mes, int dia, int hora) {
        int auxMes = 0, diaAux = 0, auxHora = 0;

        for (int i = 0; i < compromisso.length; i++) {
            for (int j = 0; j < compromisso[i].length; j++) {
                for (int k = 0; k < compromisso[i][j].length; k++) {
                    if (k == hora) {
                        auxHora = k;
                    }
                }
            }
        }
        return ("Tarefa: " + compromisso[mes][dia][hora] + " Horário: " + auxHora);

    }

    public static void main(String[] args) {
        Ex5 ex5 = new Ex5();

        Scanner scan = new Scanner(System.in);

        boolean pergunta = true;

        while (pergunta != false) {

            System.out.println("Informe o mês da tarefa");
            int mes = scan.nextInt();

            System.out.println("Informe o dia do compromisso");
            int dia = scan.nextInt();

            System.out.println("Informe o horário do compromisso ");
            int horario = scan.nextInt();
            System.out.println("Informe a tarefa");
            String tarefa = scan.next();

            ex5.agendarCompromisso(mes, dia, horario, tarefa);

            System.out.println("");
            System.out.println("Deseja cadastrar uma tarefa nova?");
            pergunta = scan.nextBoolean();

            System.out.println("");

        }
        System.out.println("Deseja pesquisar um compromisso?");
        boolean confirmacao = scan.nextBoolean();

        if (confirmacao == true) {

            System.out.println("informe o mês");
            int mes = scan.nextInt();

            System.out.println("Informe o dia ");
            int dia = scan.nextInt();

            System.out.println("Informe o horário");
            int horario = scan.nextInt();

            System.out.println(ex5.pesquisarCompromisso(mes, dia, horario));
        }
    }
}
