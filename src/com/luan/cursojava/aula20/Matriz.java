/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luan.cursojava.aula20;

// tirando a média da nota de alunos, usando matrizes
public class Matriz {
    public static void main(String[] args) {
        
        
        // declarando uma matriz diretamente.
        double notas[][] = {{5,6,9,8}, {6,6,9,9}};
        double[][] notasAlunos = new double[3][4];
        
        notasAlunos[0][0] = 2;
        notasAlunos[0][1] = 5;
        notasAlunos[0][2] = 9;
        notasAlunos[0][3] = 9.5;
        
        notasAlunos[1][0] = 10;
        notasAlunos[1][1] = 7;
        notasAlunos[1][2] = 9;
        notasAlunos[1][3] = 9.5;
        
        
        notasAlunos[2][0] = 6;
        notasAlunos[2][1] = 7;
        notasAlunos[2][2] = 9;
        notasAlunos[2][3] = 8;
        
        double soma;
        for (int i = 0; i <notasAlunos.length; i++) {
            soma = 0;
            for (int j = 0; j <notasAlunos[i].length; j++) {
                soma += notasAlunos[i][j];
            }
            
            System.out.println("Média do aluno: "+i + " é = "+ (soma/4));
        }
        
       
        
        
    }
}
