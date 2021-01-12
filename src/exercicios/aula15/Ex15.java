/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula15;

import java.util.Scanner;


public class Ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe a 1° parte do triangulo");
        int parte1Triangulo = scan.nextInt();
        
        System.out.println("informe a 2° parte do triangulo");
        int parte2Triangulo = scan.nextInt();
        
        System.out.println("Informe a 3° parte do triangulo");
        int parte3Triangulo = scan.nextInt();
        
       int somaDosLados = parte1Triangulo + parte2Triangulo;
       
       if(somaDosLados > parte3Triangulo){
           if (parte1Triangulo == parte2Triangulo && parte1Triangulo == parte3Triangulo){
               System.out.println("Triângulo equilátero");
           }
           if (parte1Triangulo == parte2Triangulo || parte1Triangulo == parte3Triangulo || parte2Triangulo == parte3Triangulo){
               System.out.println("Triângulo isósceles");
           }
           if (parte1Triangulo != parte2Triangulo && parte1Triangulo != parte3Triangulo && parte2Triangulo != parte3Triangulo){
               System.out.println("Triângulo escaleno");
           }
       }
    }
}
