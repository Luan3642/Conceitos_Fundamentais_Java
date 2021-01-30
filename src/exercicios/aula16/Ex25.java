/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula16;

import java.util.Scanner;

public class Ex25 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = 0;
        double dinheiroFornecido, total = 0, valorProduto = 0, troco = 0;

        do {
            i++;
            System.out.println("Produto " + i );
            valorProduto = scan.nextDouble();
            
            total += valorProduto;
           

        } while (valorProduto != 0);
        System.out.println("Qual o valor em dinheiro fornecido");
        dinheiroFornecido = scan.nextDouble();
        
        troco = dinheiroFornecido - total;
        
        System.out.println("Total: RS "+total);
        System.out.println("Dinheiro: R$: "+dinheiroFornecido);
        System.out.println("Troco: R$: "+troco);
        
        
        
    }
}
