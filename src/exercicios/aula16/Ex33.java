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
public class Ex33 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
        double soma = 0;
    
        System.out.println("Digite o n termo");
        int n = scan.nextInt();
            for (int i = 1, j = 1; i < n; j+=2, i++) {
                System.out.print(i+ "/" + j + " + ");
                
                soma += i/j;
            }
            
            System.out.println("soma: "+soma);
        }
    }
