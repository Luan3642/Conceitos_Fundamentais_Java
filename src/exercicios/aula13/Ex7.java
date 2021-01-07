/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula13;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe a base do quadrado");
        int b = scan.nextInt();
        
        System.out.println("Informe a altura");
        int h = scan.nextInt();
        
        int a = b * h;
        
        System.out.println("o dobro desse resultado é: "+ (a*2));
    }
}
