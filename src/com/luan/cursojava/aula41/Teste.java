/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luan.cursojava.aula41;

/**
 *
 * @author Luan
 */
public class Teste {
    public static void main(String[] args) {
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();

        aluno.setEndereco("Rua 2, num 2");
        professor.setEndereco("Rua 3, num 3");

//        System.out.println(aluno.obterEtiquetaEndereco());
//        System.out.println(professor.obterEtiquetaEndereco());
        
        aluno.imprimirEtiquetaEndereco();
        professor.imprimirEtiquetaEndereco();
    }
}
