/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luan.cursojava.aula21;

import java.util.Random;

/**
 *
 * @author Luan
 */
public class ForEach {
    public static void main(String[] args) {
        int[] notas = new int[10];
        
        
        Random rd = new Random();
        for (int i = 0; i <notas.length; i++) {
            notas[i] = rd.nextInt(20);
        }
        
         for(int i = 0; i<notas.length; i++){
             System.out.println(notas[i]);
         } 
         
         System.out.println("Usando o forEach");
         for(int nota : notas){
             System.out.println(nota);
         }
        int[][] notasAlunos = new int[3][3];
         
         
         // exemplo 2
         
         notasAlunos[0][0] = 2;
        notasAlunos[0][1] = 5;
        notasAlunos[0][2] = 9;
        
        notasAlunos[1][0] = 10;
        notasAlunos[1][1] = 7;
        notasAlunos[1][2] = 9;
        
        
        notasAlunos[2][0] = 6;
        notasAlunos[2][1] = 7;
        notasAlunos[2][2] = 9;
         
        
        
        for(int[] notasAluno : notasAlunos){
            for (int i : notasAluno) {
                System.out.println(i +" ");
            }
            System.out.println("");
        }
    }
}
