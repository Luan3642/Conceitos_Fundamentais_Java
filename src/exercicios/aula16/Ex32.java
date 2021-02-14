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
public class Ex32 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pedidos = 0;

     
        
         int qtdeCachorroQuente = 0;
         int qtdeBauruSimples = 0;
         int qtdeBauruComOvo = 0;
         int qtdeHamburguer = 0;
         int qtdeCheeseBurguer = 0;
         int qtdeRefrigerantes = 0;
         
         double valorIndividualCachorroQuente = 0;
         double valorIndividualBauruSimples = 0;
         double valorIndividualBauruComOvo = 0;
         double valorIndividualHamburguer = 0;
         double valorIndividualCheeseBurguer = 0;
         double valorIndividualRefrigerantes = 0;

         
                  
        
        boolean resposta = true;

        int quantidades = 0;
        
        
        
        System.err.println("0 - SAIR");
        
        System.out.println("");
        System.out.println("100 - cachoro quente, 1.20");
        System.out.println("101 - Bauru simples, 1.30");
        System.out.println("102- Bauro com ovo, 1.50");
        System.out.println("103- Hambúrguer, 1.20");
        System.out.println("104- Cheesebuerguer, 1.30");
        System.out.println("105- Refrigerante, 1.00");
        
       

       


        do {
            System.out.println("Informe o código dos itens pedidos");
            pedidos = scan.nextInt();
            
            switch (pedidos) {
                case 100:
                    System.out.println("");
                    System.out.println("Informe a quantidade de cachorros quentes que deseja");
                    qtdeCachorroQuente = scan.nextInt();
                    
                    valorIndividualCachorroQuente = qtdeCachorroQuente * 1.20;
                    break;
                case 101:
                    System.out.println("Informe a quantidade de bauru simples que deseja");
                    qtdeBauruSimples = scan.nextInt();
                    
                    valorIndividualBauruSimples = qtdeBauruSimples  * 1.30;
                    break;
                case 102:
                    System.out.println("Informe a quantidade de bauru com ovo que deseja");
                    qtdeBauruComOvo = scan.nextInt();
                    
                    valorIndividualBauruComOvo = qtdeBauruComOvo * 1.50;
                    break;
                case 103: 
                    System.out.println("Informe a quantidade de hamburguer  que deseja");
                    qtdeHamburguer= scan.nextInt();
                    
                    valorIndividualHamburguer = qtdeHamburguer * 1.20;
                    break;
                case 104: 
                    System.out.println("Informe a quantidade de cheeseburguer  que deseja");
                    qtdeCheeseBurguer = scan.nextInt();
                    
                    valorIndividualCheeseBurguer = qtdeCheeseBurguer * 1.30;
                    break;
                case 105:
                    System.out.println("Informe a quantidade de refrigerante  que deseja");
                    qtdeRefrigerantes = scan.nextInt();
                    
                    valorIndividualRefrigerantes = qtdeRefrigerantes * 1.00;
                    break;
                default: 
                  System.out.println("PEDIDO ERRADO");
                  break;

            }
  

        } while (pedidos != 0);
        
        
        System.out.println("Você irá pagar: "+"R$ "+ valorIndividualCachorroQuente + "  cachorro quente: ");
        System.out.println("Você irá pagar: "+"R$ "+ valorIndividualBauruSimples + "  bauru simples: ");
        System.out.println("Você irá pagar: "+"R$ "+ valorIndividualBauruComOvo + "  bauru com ovo: ");
        System.out.println("Você irá pagar: "+"R$ "+ valorIndividualHamburguer + "  hamburguer ");
        System.out.println("Você irá pagar: "+"R$ "+ valorIndividualCheeseBurguer + "  cheese burguer: ");
        System.out.println("Você irá pagar: "+"R$ "+ valorIndividualRefrigerantes + "  refrigerantes: ");
        
        double total = valorIndividualBauruComOvo + valorIndividualBauruSimples + valorIndividualCachorroQuente + 
                valorIndividualCheeseBurguer + valorIndividualHamburguer + valorIndividualRefrigerantes;
        
        
        System.out.println("Valor total R$: "+total);
        
    }
}
