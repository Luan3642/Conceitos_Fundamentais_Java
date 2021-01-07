/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula13;

import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("Informe a temperatura em Farenheit");
        int f = scan.nextInt();
        
        int c = (5 * (f -32 )/9);
        
        System.out.println(f + " Fahrenheit"+ " em celsius é: " +c + " graus");
    }
}
