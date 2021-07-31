/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula19;


import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        
        int[] alunos = new int[10];
        float[] nota1 = new float[10];
        float[] nota2 = new float[10];
        
        float[] result = new float[10];
        
        for (int i = 0; i <alunos.length; i++) {
            System.out.println("Informe a primeira nota do " + (i+1) + " aluno");
            nota1[i] = scan.nextFloat();
            System.out.println("Informe a segunda nota do "+ (i+1)+ " aluno");
            nota2[i] = scan.nextFloat();
            
            result[i] = (nota1[i] + nota2[i]) / 2;
            
            if(result[i] > 7){
                System.out.println("O "+(i+1)+ " aluno, foi aprovado");
                System.out.println("");
            } else{
                System.out.println("O "+(i+1)+ " aluno., foi reprovado");
                System.out.println("");
            }
            
        }
    }
}
