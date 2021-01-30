/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula16;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("Informe um número para delimitar a média de N de notas ");
        int n = scan.nextInt();
        
        int soma = 0;
        int media = 0;
        
        
        for (int i = 1; i <=n; i++) {
            soma += i;
            media = soma / n;
        }
        
        System.out.println("A média é: " +media);
        
        
    }
}
