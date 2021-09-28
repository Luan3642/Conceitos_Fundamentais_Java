/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula19;

import java.util.Scanner;

import java.util.Scanner;

public class Ex18 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int valor1;
        int valor2;

        int maior = 0;
        int menor = 0;

        System.out.println("digite primeiro valor");
        valor1 = scan.nextInt();

        System.out.println("Digite o segundo valor");
        valor2 = scan.nextInt();

        if (valor1 > valor2) {
            maior = valor1;
            menor = valor2;
        } 
        
        if(valor2 > valor1 ){
            maior = valor2;
            menor = valor1;
        }
        System.out.println("maior: "+ maior);
        System.out.println("Menor: "+menor);
    }

}
