/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula16;

import java.util.Scanner;

public class Ex26 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o número que deseja saber o fatorial");
        int nm = scan.nextInt();

        System.out.println("");
        int anterior = 0;
        int fatorial = 0;

        System.out.print(nm);

        for (int i = 1; i < nm; i++) {
            if (i == 1) {
                anterior = nm - 1;
                fatorial = nm * anterior;
                System.out.print(" * " + anterior + " ");

            } else {
                anterior = anterior - 1;

                fatorial = fatorial * anterior;
                System.out.print(" * " + anterior + " ");
            }

        }

        System.out.println(" = " + fatorial);

    }

}
