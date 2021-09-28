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
public class Ex22 {

    
    public static void main(String[] args) {
        int numero =0;
        Integer aux = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <=5; i++) {
            System.out.println("Informe um número");
            numero = scan.nextInt();
            if (numero > aux){
                aux = numero;
            }
        }
        System.out.println("Maior: "+aux);
    }
}
