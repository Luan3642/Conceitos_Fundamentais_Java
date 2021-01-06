/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luan.cursojava.aula12;

import java.util.Scanner;

public class LeituraDeDados {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        
//        System.out.println("Digite seu nome completo");
//        String nome = scan.nextLine();
//        
//        
//        System.out.println("O nome completo é: "+nome);
//        
//        System.out.println("");
//        
//        
//        System.out.println("Digite seu primeiro nome");
//        String primeiroNome = scan.nextLine();
//        
//        
//        System.out.println("Seu primeiro nome: "+primeiroNome);
        
//        
//        System.out.println("Digite a sua idade");
//        int idade = scan.nextInt();
//        
//        System.out.println("A sua idade é: "+ idade);
//        
//        System.out.println("Digite a sua altura");
//        double altura = scan.nextDouble();
//        
//        System.out.println("A sua altura é: "+ altura);
        
           System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem animais de estimação: ");
           String primeiroNome = scan.next();
           int idade = scan.nextInt();
           byte quantidadeFilhos = scan.nextByte();
           float altura = scan.nextFloat();
           boolean bichoEstimacao = scan.nextBoolean();
           
           
           System.out.println("Você digitou os seguintes valores:  ");
           System.out.println("Nome: "+primeiroNome);
           System.out.println("idade: "+idade);
           System.out.println("quantidade de filhos: "+quantidadeFilhos);
           System.out.println("Altura: "+ altura);
           System.out.println("bicho Estimacao? "+bichoEstimacao);
    }
}
