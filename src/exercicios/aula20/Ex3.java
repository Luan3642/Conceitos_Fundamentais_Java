/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula20;

import java.util.Scanner;

/**
 *
 * @author Luan
 */
public class Ex3 {
    public static void main(String[] args) {
        
        int m [][][] = new int[3][3][3];
        
        int par = 0, impar = 0;
        Scanner scan = new Scanner(System.in);
        
        for (int i = 0; i <m.length; i++) {
            for (int j = 0; j <m[i].length; j++) {
                for (int k = 0; k <m[j].length; k++) {
                    System.out.println("Informe os valores" );
                    m[i][j][k] = scan.nextInt();
                    
                    if(m[i][j][k] % 2 == 0){
                        par++;
                    } else{
                        impar++;
                    }
                }
            }
        }
        
        for (int i = 0; i <m.length; i++) {
            for (int j = 0; j <m[i].length; j++) {
                for (int k = 0; k <m[i][j].length; k++) {
                    System.out.print(m[i][j][k] + " - ");
                }
            }
            System.out.println("");
        }
        
        System.out.println("Pares: "+par);
        System.out.println("Impares: "+impar);
    }
}
