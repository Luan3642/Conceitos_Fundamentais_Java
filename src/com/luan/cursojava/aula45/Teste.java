/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luan.cursojava.aula45;

/**
 *
 * @author Luan
 */
public class Teste {

    public static void main(String[] args) {
//        Aluno aluno = new Aluno();
//        Pessoa pessoaAluno = aluno; //upcasting
//
//        Pessoa aluno2 = (Pessoa) new Aluno();
//
//        Pessoa aluno3 = new Pessoa();
//        Aluno aluno4 = (Aluno) aluno3;


    Pessoa pessoa = new Pessoa();
    Aluno aluno = new Aluno();
    Professor prof = new Professor();
    
    
    if (pessoa instanceof Pessoa){
        System.out.println("é do tipo pessoa");
    }
    
    if (aluno instanceof Aluno){
        System.out.println("é do tipo aluno");
    }
    
    if(prof instanceof Professor){
        System.out.println("é do tipo professor");
    }
    }

}
