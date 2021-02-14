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
public class Ex34 {
    public static void main(String[] args) {
        
        double soma = 0;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de n termos");
        int n = scan.nextInt();
        
        for (int i = 1; i <n; i++) {
            System.out.print(1 + "/" + i + " + " );
            
            soma += 1/i;
        }
        
        System.out.println("\nO valor da soma é: "+soma);
        
        
    }
}
