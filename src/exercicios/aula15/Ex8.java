/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula15;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
       
        
        System.out.println("Informe o preço do feijão ");
        double feijao = scan.nextDouble();
        
        System.out.println("Informe o preço do sabão");
        double sabao = scan.nextDouble();
        
        System.out.println("Informe o preço da picanha");
        double picanha = scan.nextDouble();
        
        if(feijao < sabao && feijao < picanha){
            System.out.println("Compre feijão, pois ele custa apenas: " +feijao);
        }
        
        if(sabao < feijao && sabao < picanha){
            System.out.println("Compre Sabão, pois ele custa apenas: " +sabao);
        }
        
        if(picanha < feijao && picanha < sabao){
            System.out.println("Compre picanha, pois ela custa apenas: " +picanha);
        }
        
    }
}
