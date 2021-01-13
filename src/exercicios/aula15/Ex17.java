/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula15;

import java.util.Scanner;

/**
 *
 * @author luan3
 */
public class Ex17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe um ano, para saber se ele é bissexto ou não");
        int ano = scan.nextInt();
        
        
        if(ano % 4 ==0){
            System.out.println("O ano é bissexto");
        } else{
            System.out.println("Esse ano não é bissexto");
        }
        
    }
}
