/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula15;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe o turno em que você estuda");
        String turno = scan.nextLine();
        
        String maisculo = turno.toUpperCase();
        
        switch(maisculo){
            case "M":
                System.out.println("Bom dia");
                break;
            case "V":
                System.out.println("Boa tarde");
                break;
            case "N":
                System.out.println("Boa noite");
                break;
            default:
                System.out.println("Opção inválida");
                break;
                
        }
    }
}
