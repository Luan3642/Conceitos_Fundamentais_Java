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
public class Ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        int num = 0;
        int soma = 0;
        int media = 0;
      
        for (int i = 1; i <=5; i++) {
            System.out.println("Informe o "+ i + " numero");
            num = scan.nextInt();
            
           soma += num;
          
          
            
        } 
        media = soma / 5;
        System.out.println("A soma é: "+ soma);
        System.out.println("A média é: "+media);
    }
    
    
}
