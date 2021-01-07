/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula13;


import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe a temperatura em graus celsius");
        int c = scan.nextInt();
        
        int conversao = (c * 9/5) + 32;
        
        System.out.println(+c + " graus celsius, em Fahrenheit é: " +conversao);
        
        
    }
}
