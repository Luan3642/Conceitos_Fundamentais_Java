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
public class Ex7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero = 0;

        int maior = Integer.MIN_VALUE;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Informe o " + i + " número");
            numero = scan.nextInt();

            if (numero > maior) {
                maior = numero;
            }

        }
        
        System.out.println("O maior número é: "+maior);
        

    }
}
