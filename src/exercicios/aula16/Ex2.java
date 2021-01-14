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
public class Ex2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um nome de usuário");
        String nomeUsario = scan.nextLine();

        System.out.println("Informe a sua senha");
        String senha = scan.nextLine();
        
        System.out.println("");

        while (nomeUsario.equalsIgnoreCase(senha)) {
            System.out.println("A senha e o nome não podem ser iguais");

            System.out.println("Informe um nome de usuário");
            nomeUsario = scan.nextLine();

            System.out.println("Informe a sua senha");
            senha = scan.nextLine();
        }
        
        System.out.println("Usuário e senha aceitos");
    }
}
