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
public class Ex22 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe a quantidade de CDS");
        int quantidadeCds = scan.nextInt();
        
        int valorTotal = 0;
        int media = 0;
        
        for (int i = 1; i <=quantidadeCds; i++) {
            System.out.println("Informe o valor gasto para cada um deles");
            double valorGasto = scan.nextDouble();
            
            valorTotal += valorGasto;
            media = valorTotal / quantidadeCds;
            
        }
        System.out.println("Valor total: "+valorTotal);
        System.out.println("Média gasta em cada um deles: "+media);
    }
}
