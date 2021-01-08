/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luan.cursojava.aula14;

import java.util.Scanner;
public class IfElse {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println("informe a sua idade");
//        int idade = scan.nextInt();
//        
//        if(idade >= 18){
//            System.out.println("maior de idade");
//        } else{
//            System.out.println("Menor de idade");
//        }
//        
//        

        // barato <= 10
        // 10 < valor < 15 - pedir desconto
        // 15  <= valor 17 - pesquisar mais 
        // >= 17- muito caro
        System.out.println("Entre com o preço do item");
        double valor = scan.nextDouble();

        if(valor <=10){
            System.out.println("barato");
        }else{
            if(valor >=10 && valor <15){
                 System.out.println("Pedir desconto");
            }
            else{
                if(valor <=15 && valor <=17){
                    System.out.println("Pesquisar mais");
                }
                else{
                    if(valor >=17){
                        System.out.println("Pesquisar mais");
                    }
                }
            }
        }


    }
}
