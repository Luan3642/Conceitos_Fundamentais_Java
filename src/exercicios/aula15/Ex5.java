/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula15;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          
          System.out.println("Informe uma nota ");
          int nota = scan.nextInt();
          
          System.out.println("Informe outra nota");
          int outraNota = scan.nextInt();
          
          
          int media = (nota + outraNota) /2;
          
          if(media>=7 && media <10){
              System.out.println("Aprovado");
          } else if(media <7){
              System.out.println("Reprovado");
          } else if(media >=10){
              System.out.println("Aprovado com distinção");
          }
    }
}
