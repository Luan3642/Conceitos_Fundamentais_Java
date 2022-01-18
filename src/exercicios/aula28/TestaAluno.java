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
public class TestaAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
       
        int[] notas = {10,7,6};
        String[] disciplina = {"matemática", "geografia", "fisica"};
        
        aluno.aprovado(disciplina, notas);
        
    }
}
