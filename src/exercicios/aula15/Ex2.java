/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula15;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe um valor");
        int valor = scan.nextInt();
        
        if(valor <0){
            System.out.println(valor+ " é um Valor negativo");
        } else{
            System.out.println(valor+ " é um valor é positivo");
        }
    }
}
