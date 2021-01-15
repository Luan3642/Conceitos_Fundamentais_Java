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
public class Ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe o número que deseja para obter a tabuada");
        int numeroTabuada = scan.nextInt();
        
        
        for (int i = 0; i <=10; i++) {
            System.out.println(numeroTabuada+" * " + i + " = " + numeroTabuada * i);
        }
    }
}
