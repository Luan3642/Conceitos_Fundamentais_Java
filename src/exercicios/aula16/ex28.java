/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula16;

import java.util.Scanner;


public class ex28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe um número para saber se é primo ou não");
        int nm = scan.nextInt();
        
        boolean primo = true;
        
        for (int i = 2; i <nm ; i++) {
            if (nm % i == 0){
                primo = false;
            } 
        }
        
        if(primo){
            System.out.println("O número é primo");
        } else{
            System.out.println("Não é primo");
        }
    }
}
