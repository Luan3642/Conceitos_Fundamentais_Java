/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula27;

/**
 *
 * @author Luan
 */
public class TestaAluno {
    public static void main(String[] args) {
        
        Aluno aluno = new Aluno();
        int[] notasPassada = {10,10,7};
        String[] disciplina = {"matemática", "história", "fisica"};
        
        aluno.aprovado(notasPassada,disciplina);
    }
}
