/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula36;

import java.util.Scanner;

/**
 *
 * @author Luan
 */
public class TesteCurso {
    
    public static void main(String[] args) {
        Curso curso = new Curso();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Alunos");
        double[] notas = new double[4];
        
        Aluno[] alunos = new Aluno[5];
        
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Entre com o nome do aluno" + (i + 1));
            String nomeAluno = scan.next();
            
            System.out.println("Entre com a matricula do aluno " + (i + 1));
            String matricula = scan.next();
            
            for (int j = 0; j < notas.length; j++) {
                System.out.println("Entre com a nota " + (j + 1));
                notas[j] = scan.nextDouble();
            }
            Aluno aluno = new Aluno();
            aluno.setNotas(notas);
            
            alunos[i] = aluno;
        }
        
        curso.setNotas(notas);
        curso.obterMedia();
        
        
    }
}
