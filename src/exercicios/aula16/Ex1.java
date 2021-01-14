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
public class Ex1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Informe uma nota, entre 0 e 10");
        int nota = scan.nextInt();

        while (nota >10 || nota <0) {
            System.out.println("valor Inválido, informe uma nota entre 0 e 10");
            nota = scan.nextInt();
        }
        
        System.out.println("Valor válido");
       
    }
}
