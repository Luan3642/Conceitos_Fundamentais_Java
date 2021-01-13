/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula15;

import java.util.Scanner;

public class Ex19 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe 1 número");
        int n1 = scan.nextInt();

        System.out.println("Informe 2 número");
        int n2 = scan.nextInt();
        
        System.out.println();
        
        System.out.println("1- soma ");
        System.out.println("2- subtração");
        System.out.println("3- multiplicação");
        System.out.println("4- divisão");
        
        
        System.out.println("Informe a operação que deseja");
        int escolha = scan.nextInt();

       
       System.out.println();

        switch (escolha) {
            case 1:
                int soma = n1 + n2;
                System.out.println("A soma é: "+soma);
                
                if(soma % 2 == 0){
                    System.out.println("O número é par");
                } else{
                    System.out.println("Número impar");
                }
                
                if(soma >=0){
                    System.out.println("Número positivo");
                } else{
                    System.out.println("Número negativo");
                }
                
                break;
                
            case 2:
                int subtracao = n1 - n2;
                System.out.println("A subtração é: "+subtracao);
                
                 if(subtracao % 2 == 0){
                    System.out.println("O número é par");
                } else{
                    System.out.println("Número impar");
                }
                
                if(subtracao >=0){
                    System.out.println("Número positivo");
                } else{
                    System.out.println("Número negativo");
                }
                
                
                break;
                
            case 3:
                int multiplicao = n1 * n2;
                System.out.println("A multiplicação é: "+multiplicao);
                
                if(multiplicao % 2 == 0){
                    System.out.println("O número é par");
                } else{
                    System.out.println("Número impar");
                }
                
                if(multiplicao >=0){
                    System.out.println("Número positivo");
                } else{
                    System.out.println("Número negativo");
                }
                break;
                
            case 4:
                int divisao = n1 / n2;
                System.out.println("A divisão é: "+divisao);
                
                  if(divisao % 2 == 0){
                    System.out.println("O número é par");
                } else{
                    System.out.println("Número impar");
                }
                
                if(divisao >=0){
                    System.out.println("Número positivo");
                } else{
                    System.out.println("Número negativo");
                }
                break;
                
            default:
                System.out.println("Número digitado inválido");

        }

    }
}
