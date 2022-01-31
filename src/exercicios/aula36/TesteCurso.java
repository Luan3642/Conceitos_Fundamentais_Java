/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula36;

/**
 *
 * @author Luan
 */
public class TesteCurso {
    public static void main(String[] args) {
        Curso curso = new Curso();
        
        
        
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();
        Aluno aluno4 = new Aluno();
        Aluno aluno5 = new Aluno();
        
        int[] notasAluno1 = {10,10};
        int[] notasAluno2 = {10,10};
        int[] notasAluno3 = {7,7};
        int[] notasAluno4 = {5,5};
        int[] notasAluno5 = {6,6};
         
        aluno1.setNotas(notasAluno1);
        aluno2.setNotas(notasAluno2);
        aluno3.setNotas(notasAluno3);
        aluno4.setNotas(notasAluno4);
        aluno5.setNotas(notasAluno5);
        
        
        Aluno[] alunos = new Aluno[5];
        
        alunos[0] = aluno1;
        alunos[1] = aluno2;
        alunos[2] = aluno3;
        alunos[3] = aluno4;
        alunos[4] = aluno5;
        
        
        curso.setAluno(alunos);
        
        curso.checarNotas();
        
    }
}
