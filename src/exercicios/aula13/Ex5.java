/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula13;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("entre com o tamanho em metros: ");
        int metros = scan.nextInt();
        
        float centrimetros = metros * 100;
        
        
        System.out.println(+metros +" metros"+ " equivale a " + centrimetros+" centrimetros");
    }
}
