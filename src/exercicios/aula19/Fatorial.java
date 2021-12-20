/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula19;

import java.util.Scanner;

/**
 *
 * @author Luan
 */
public class Fatorial {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o número que deseja o fatorial");
        int numero = scan.nextInt();
        int j = numero;

        if (numero <= 0) {
            System.out.println("Fatorial 1"); 
        } else {
            for (int i = numero; i >= 2; i--) {
                j = j * (i-1);
    
            }
        }
        
        System.out.println("Fatorial de "+ numero + "!" + " = "+j);

    }
}
