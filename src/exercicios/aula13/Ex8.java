/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula13;

import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Quanto você ganha por hora?");
        double ganhaHoras = scan.nextDouble();
        
        System.out.println("Informe a quantidade de horas que você trabalhou no mês");
        int quantidadeHorasTrabalhadas = scan.nextInt();
        
        
        System.out.println("Você ganhou no mês: " +ganhaHoras *quantidadeHorasTrabalhadas);
      
    }
}
