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
public class Ex14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numerosPares = 0;
        int numerosImpares = 0;
        
        for (int i = 1; i <=10; i++) {
            
            System.out.println("Informe " + i + " número");
            int numeros = scan.nextInt();
            
            if(numeros % 2 == 0){
                numerosPares++;
            } else{
                numerosImpares++;
            }
        }
        
        System.out.println("Quantidade de números pares: "+numerosPares);
        System.out.println("Quantidade de números ímpares: "+numerosImpares);
        
    }
}
