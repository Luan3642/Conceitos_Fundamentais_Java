/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula16;

import java.util.Scanner;

/**
 *
 * @author luan3
 */
public class Ex11 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o primeiro número");
        int n1 = scan.nextInt();
        
        System.out.println("Entre com o segundo número");
        int n2 = scan.nextInt();
        
        int soma = 0;
        
        
        for (int i = n1; i <=n2; i++) {
            soma += i;
            
        }
        
        System.out.println("A soma é: "+soma);
        
        
    }
}
