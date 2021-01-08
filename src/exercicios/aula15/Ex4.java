/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe uma letra");
        String letra = scan.nextLine();
        
        String maisculo = letra.toUpperCase();
        
        switch(maisculo){
            case "A":
                System.out.println("Vogal");
                break;
            case "E": 
                System.out.println("Vogal");
                break;
            case "I":
                System.out.println("Vogal");
                break;
            case "O":
                System.out.println("Vogal");
                break;
            case "U":
                System.out.println("Vogal");
                break;
            default: 
                System.out.println("Consoante");      
                break;
        }
    }
}
