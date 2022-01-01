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

    public static String[][] compromissos = new String[32][24];

    public void marcaComprimisso(int dia, int horarioCompromisso, String tarefa) {

        compromissos[dia][horarioCompromisso] = tarefa;

    }

    public String pesquisarCompromisso(int diaPesquisa, int horaPesquisa) {
        int aux = 0;
        for (int i = 0; i < compromissos.length; i++) {
            for (int j = 0; j < compromissos[i].length; j++) {
                if (j == horaPesquisa) {
                    aux = j;
                }
            }
        }
        System.out.println("");
        return ("Tarefa: " + compromissos[diaPesquisa][horaPesquisa] + "\n" + "Horário: " + aux);

    }

    public static void main(String[] args) {
        Ex6 ex6 = new Ex6();

        Scanner scan = new Scanner(System.in);

        boolean pergunta = true;

        while (pergunta != false) {

            System.out.println("Informe o dia do compromisso");
            int dia = scan.nextInt();

            System.out.println("Informe o horário do compromisso ");
            int horario = scan.nextInt();

            System.out.println("Informe a tarefa");
            String tarefa = scan.next();

            ex6.marcaComprimisso(dia, horario, tarefa);

            System.out.println("");
            System.out.println("Deseja cadastrar uma tarefa nova?");
            pergunta = scan.nextBoolean();

            System.out.println("");

        }
        System.out.println("Deseja pesquisar um compromisso?");
        boolean confirmacao = scan.nextBoolean();
        
        if(confirmacao == true ){
            System.out.println("Informe o dia ");
            int dia = scan.nextInt();
            
            System.out.println("Informe o horário");
            int horario = scan.nextInt();
            
            System.out.println(ex6.pesquisarCompromisso(dia, horario));
        }
    }
}
