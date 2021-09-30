/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula19;


import java.util.Scanner;

public class Ex19 {
     public static void main(String[] args) {
        float[] nota1 = new float[10];
        float[] nota2 = new float[10];
        float[] result = new float[10];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < nota1.length; i++) {
            System.out.println("Informe a primeira nota, do aluno " + (i + 1));
            nota1[i] = scan.nextInt();

            System.out.println("informe a segunda nota, do aluno " + (i + 1));
            nota2[i] = scan.nextInt();
            
            result[i] = (nota1[i] + nota2[i]) / 2;
            
            if(result[i] > 7){
                System.out.println("Aprovado, aluno " +(i+1));
            }else{
                System.out.println("Reprovado, aluno " +(i+1));
            }
        }

       

        
    }
}
