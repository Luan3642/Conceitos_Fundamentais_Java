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
public class Ex20 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a quantidade de pessoas que deseja saber a idade");
        int pessoas = scan.nextInt();

        int idadePessoas = 0;
        
        int countJovem = 0;
        int countAdulto = 0;
        int countIdoso = 0;

        for (int i = 1; i <= pessoas; i++) {
            System.out.println("Informe a " +i + " idade");
            idadePessoas = scan.nextInt();

            if (idadePessoas > 0 && idadePessoas < 25) {
                countJovem++;
            } else if (idadePessoas >25  && idadePessoas <=60){
                countAdulto++;
            } else if (idadePessoas >60){
                countIdoso++;
            }
        }
        
        if(countJovem > countAdulto && countJovem > countIdoso){
            System.out.println("Turma jovem");
        }
        
        if(countAdulto > countJovem && countAdulto > countAdulto){
            System.out.println("Turma adulta");
        }
        
        if(countIdoso > countJovem && countIdoso > countAdulto){
            System.out.println("Turma idosa");
        }
        

    }
}
