/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula16;

import java.util.Scanner;


public class Ex24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe o valor do pao");
        double valorPao = scan.nextDouble();
        
        for (int i = 1; i <=50; i++) {
            System.out.println(i+ " - R$ " + i * valorPao);
        }
    }
}
