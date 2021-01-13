/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula15;

import java.util.Scanner;

public class Ex22 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Você quer comprar Maçãs - 1,  ou Morangos - 2");
        int escolhaFruta = scan.nextInt();

        switch (escolhaFruta) {
            case 1:
                System.out.println("Informe a quantidade em KG de maçãs");
                int qtdeKgMacas = scan.nextInt();

                double pagar = 0;

                if (qtdeKgMacas <= 5) {
                    pagar = qtdeKgMacas * 1.80;
                    System.out.println("Você irá pagar pelas maçãs: " + pagar);
                } else if (qtdeKgMacas > 5) {
                    pagar = qtdeKgMacas * 1.50;
                    System.out.println("Você irá pagar pelas maçãs: " + pagar);
                } else if (qtdeKgMacas > 8 || pagar > 25) {
                    pagar = qtdeKgMacas * 1.50;
                    double pagarDesconto = pagar / (100 / 10);

                    double vouPagar = pagar - pagarDesconto;

                    System.out.println("Você irá pagar pelas maçãs: " + vouPagar);

                }

                break;

            case 2:
                System.out.println("Informe a quantidade em KG de morangos");
                int qtdeKgMorangos = scan.nextInt();
                
                pagar = 0;
                
                if (qtdeKgMorangos <= 5) {
                    pagar = qtdeKgMorangos * 2.50;
                    System.out.println("Você irá pagar pelas maçãs: " + pagar);
                } else if (qtdeKgMorangos > 5) {
                    pagar = qtdeKgMorangos * 2.20;
                    System.out.println("Você irá pagar pelas maçãs: " + pagar);
                } else if (qtdeKgMorangos > 8 || pagar > 25) {
                    pagar = qtdeKgMorangos * 2.20;
                    double pagarDesconto = pagar / (100 / 10);

                    double vouPagar = pagar - pagarDesconto;

                    System.out.println("Você irá pagar pelas morangos: " + vouPagar);

                }
                break;
                
            default:
                System.out.println("Opção inválida");
                break;
        }

    }

}
