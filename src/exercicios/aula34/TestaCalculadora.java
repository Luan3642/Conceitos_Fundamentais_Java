/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula34;

import java.util.Scanner;

/**
 *
 * @author Luan
 */
public class TestaCalculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println(Calculadora.somar(2, 3));
        System.out.println(Calculadora.potencia(2));
        int n = scan.nextInt();
        System.out.println("Fatorial de "+ n +" = "+Calculadora.fatorial(n));
    }
}
