/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilhaTeste;

import java.util.Scanner;

/**
 *
 * @author luan
 */
public class Teste01 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Ex01 ex01 = new Ex01();
        
        for (int i = 0; i < 2; i++) {
            System.out.println("Digite o primero valor,  "+i);
            int valor = scan.nextInt();
            
            if(valor % 2 ==0){
                ex01.adicionarElemento(valor);
            } else{
                ex01.desimpilhar();
               
            } 
        }
        
        System.out.println(ex01.toString());
        
        if(!(ex01.vazio())){
            for (int i = 0; i <=ex01.getTamanho(); i++) {
                ex01.desimpilhar();
            }
            
            ex01.toString();
        }
        
        System.out.println("Desempilhados"+ex01.toString());
        
        
    }
}
