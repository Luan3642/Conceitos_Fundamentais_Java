/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luan.cursojava.aula43;

/**
 *
 * @author Luan
 */
public class Teste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        
        aluno.setCurso("Ciência da computação");
        double[] notas = {10,56,9,5,4};
        aluno.setNotas(notas);
        
        System.out.println(aluno);
        
        String s1 = "Luan";
        String s2 = "luan";
        
        
        System.out.println(s1.equalsIgnoreCase(s2));
        
        
        Aluno aluno2 = new Aluno();
        
        aluno2.setCurso("Ciência da computação");
        double[] notas2 = {10,56,9,5,4};
        aluno2.setNotas(notas2);
        
        System.out.println(aluno.equals(aluno2));
        
    }
}
