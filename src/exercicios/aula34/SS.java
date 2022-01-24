/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula34;

import java.util.Scanner;

/**
 *
 * @author Luan
 */
public class SS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        
        while (n >=0 && n<=10){
            System.out.println("Informe nota");
            n = scan.nextInt();
        }
        System.out.println("Nota invalida");
    }
}
