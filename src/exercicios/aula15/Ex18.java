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
public class Ex18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("Informe um número inteiro");
        int n1 = scan.nextInt();
        
        if(n1 % 2 == 0){
            System.out.println("Número par");
        } else {
            System.out.println("Impar");
        }
    }
}
