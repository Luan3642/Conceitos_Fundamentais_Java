/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula13;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe um número inteiro: ");
        int num1 = scan.nextInt();
        
        System.out.println("Informe outro número inteiro: ");
        int num2 = scan.nextInt();
        
        System.out.println("Informe um número real: ");
        int numeroReal = scan.nextInt();
        
        
        int a = (num1 * 2) * (num2/2);
        int b = num1 * 3 + numeroReal;
        int c = (int) Math.pow(numeroReal, 3);
        
        System.out.println("O produto do dobro do primeiro com a metade do segundo: "+ a);
        System.out.println("A soma do triplo do primeiro com o terceiro: "+ b);
        
        System.out.println("O cubo desse do terceiro é: "+c);
    }
}
