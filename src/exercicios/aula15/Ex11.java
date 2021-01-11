/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula15;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe seu salário");
        double salario = scan.nextDouble();

        if (salario < 280) {
            double aumento20 = salario / (100 / 20);
            double novoSalario20 = aumento20 + salario;

            System.out.println("Salário antes do reajuste: " + salario);
            System.out.println("Percentual aplicado, 20%");
            System.out.println("O percentual do aumento aplicado foi de: " + aumento20);
            System.out.println("Novo salário após o aumento: " + novoSalario20);

        } else if (salario >= 280 && salario < 700) {
            double aumento15 = salario / (100 / 15);
            double novoSalario15 = aumento15 + salario;

            System.out.println("Salário antes do reajuste: " + salario);
            System.out.println("Percentual aplicado, 15%");
            System.out.println("O percentual do aumento aplicado foi de: " + aumento15);
            System.out.println("Novo salário após o aumento: " + novoSalario15);

        } else if (salario >= 700 && salario < 1500) {
            double aumento10 = salario / (100 / 10);
            double novoSalario10 = aumento10 + salario;

            System.out.println("Salário antes do reajuste: " + salario);
            System.out.println("Percentual aplicado, 10%");
            System.out.println("O percentual do aumento aplicado foi de: " + aumento10);
            System.out.println("Novo salário após o aumento: " + novoSalario10);

        } else if (salario >= 1500) {
            double aumento5 = salario / (100 / 5);
            double novoSalario5 = aumento5 + salario;

            System.out.println("Salário antes do reajuste: " + salario);
            System.out.println("Percentual aplicado, 5%");
            System.out.println("O percentual do aumento aplicado foi de: " + aumento5);
            System.out.println("Novo salário após o aumento: " + novoSalario5);

        }
    }
}
