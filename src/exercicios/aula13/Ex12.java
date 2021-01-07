/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula13;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe a sua altura");
        float altura = scan.nextFloat();
        
        double pesoIdeal = 72.7 * altura - 58;
        
        System.out.println("Seu peso ideal é: " +pesoIdeal);
        
    }
}
