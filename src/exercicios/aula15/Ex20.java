/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula15;

import java.util.Scanner;

/**
 *
 * @author luan3
 */
public class Ex20 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Você telefonou para vítima");
        boolean telefonouVitima = scan.nextBoolean();

        System.out.println("esteve no local do crime");
        boolean esteveLocalCrime = scan.nextBoolean();

        System.out.println("Mora perto da vítima?");
        boolean moraPertodaVitima = scan.nextBoolean();

        System.out.println("Devia para vítima ");
        boolean deviaVitima = scan.nextBoolean();

        System.out.println("Já trabalhou pra vítima");
        boolean jaTrabalhouComAVitima = scan.nextBoolean();

        int frag = 0;

        if (telefonouVitima == true) {
            frag += 1;
        }

        if (esteveLocalCrime == true) {
            frag += 1;
        }

        if (moraPertodaVitima == true) {
            frag += 1;
        }

        if (deviaVitima == true) {
            frag += 1;
        }

        if (jaTrabalhouComAVitima == true) {
            frag += 1;
        }
        
        if (frag ==2){
            System.out.println("Suspeito");
        }
        
        if (frag == 3 && frag == 4){
            System.out.println("Cúmplice");
        }
        
        if (frag == 5){
            System.out.println("Assanino ");
        }
        
        if (frag <=1){
            System.out.println("Inocente");
        }

    }
}
