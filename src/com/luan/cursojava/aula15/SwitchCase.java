/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luan.cursojava.aula15;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o dia da semana ");
        int diaSemana = scan.nextInt();

        switch (diaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda feira");
                break;
            case 3:
                System.out.println("Quarta feira");
                break;
            case 4:
                System.out.println("Quinta feira");
                break;
            case 5:
                System.out.println("Sexta feira");
                break;
            case 6:
                System.out.println("Sabado");
                break;
                
            default:
                System.out.println("Dia inválido");
        }
    }

}
