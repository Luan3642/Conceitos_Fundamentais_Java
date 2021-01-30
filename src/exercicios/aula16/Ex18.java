/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula16;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        
        System.out.println("Informe um número inteiro");
        int nm = scan.nextInt();
        
     
        boolean primo = true;
        
        for(int i = 2; i<nm; i++){
            if(nm % i == 0){
//                System.out.println("Não é primo");
                primo = false;
            }
        }
        
        if(primo){
            System.out.println("Número primo");
        } else{
            System.out.println("Não primo");
        }
     
    }
}
