/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula13;


import java.util.Scanner;


public class Ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe o raio de um círuclo");
        int raioDoCirculo = scan.nextInt();
        
        double a  = 3.14 * Math.pow(raioDoCirculo, 2);
        
        System.out.println("Área do círuculo: "+a);
        
    }
}
