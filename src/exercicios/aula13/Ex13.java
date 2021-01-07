/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula13;

import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("Quanto você ganha por hora");
        double ganhaPorHora = scan.nextDouble();
        
        System.out.println("Informe o número de horas trabalhadas no mês");
        int horasTrabalhadasNoMes = scan.nextInt();
        
        double valorGanhado = ganhaPorHora * horasTrabalhadasNoMes;
        
        double descontoImpostoDeRenda = valorGanhado / (100 / 11)  ;
        
        double salarioImpostoRenda =   valorGanhado - descontoImpostoDeRenda;
        
        double salarioINSS = valorGanhado / (100 / 8);
        
        double salarioSindicato = valorGanhado / (100/ 5);
        
        double salarioLiquido = valorGanhado - descontoImpostoDeRenda - salarioINSS - salarioSindicato;
        
        System.out.println("Salário Bruto: "+ valorGanhado);
        System.out.println("Quanto pagou ao INSS: "+salarioINSS);
        System.out.println("Quanto pagou ao Sindicato: "+salarioSindicato);
        System.out.println("Salário líquido: "+salarioLiquido);
        
        
        

    }

}
