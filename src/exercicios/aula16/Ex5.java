/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula16;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a populacao paisA");
        int populacaoPaisA = scan.nextInt();

        System.out.println("Informe a populacao paisB");
        int populacaoPaisB = scan.nextInt();

        System.out.println("Informe a taixa de Crescimento do paisA");
        int taixaCrescimentoPaisA = scan.nextInt();

        System.out.println("Informe a taixa de Crescimento do paisA");
        int taixaCrescimentoPaisB = scan.nextInt();

        int anos = 0;

        while (populacaoPaisA < populacaoPaisB) {
            populacaoPaisA += (populacaoPaisA / 100) * taixaCrescimentoPaisA;
            populacaoPaisB += (populacaoPaisB / 100) * taixaCrescimentoPaisB;
            anos++;
        }
        
        System.out.println("Quantidade em anos: "+anos);

    }
}
