/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula15;

import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe o 1° valor");
        int nm1 = scan.nextInt();
        
        System.out.println("Informe o 2° valor");
        int nm2 = scan.nextInt();
        
        System.out.println("Informe o 3° valor");
        int nm3 = scan.nextInt();
        
        if(nm1 > nm2 && nm1 > nm3){
            System.out.println(nm1+" é maior que o resto dos números");    
        }
        
        if(nm2 > nm1 && nm2> nm3){
            System.out.println(nm2+ " é maior que o resto dos números");
        }
        if(nm3 > nm1 && nm3 > nm2){
            System.out.println(nm3 + " é o maor que o resto dos números");
        }
        
        
    }
}
