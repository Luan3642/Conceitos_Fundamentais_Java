/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula15;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe um número");
        int num1 = scan.nextInt();
        
        System.out.println("Informe outro número");
        int num2 = scan.nextInt();
        
        if(num1 > num2){
            System.out.println(num1+" é maior que: "+num2);
        }else{
            System.out.println(num2+ " é maior que: "+num1);
        }
    }
}
