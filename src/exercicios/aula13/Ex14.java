/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula13;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe a quantidade em megaBytes do programa que irá ser feito o download");
        int megaBytesProgramaBaixar = scan.nextInt();
        
        System.out.println("Informe a velocidade da sua internet em megaBytes");
        int velocidadeInternet = scan.nextInt();
        
        int tempoDeBaixar = megaBytesProgramaBaixar / (velocidadeInternet / 8);
        
        int minutosParaBaixar = tempoDeBaixar / 60;
        
        System.out.println("O tempo de demora para baixar esse programa será: "+minutosParaBaixar+" minutos");
    }
}
