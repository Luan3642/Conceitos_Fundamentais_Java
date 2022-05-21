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
public class Teste02 {

    public static void main(String[] args) {
        Ex02 ex02 = new Ex02();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o valor, "+i);
            int valor = scan.nextInt();
            
            if(valor % 2 == 0 && valor !=0){
                ex02.pushPar(valor);
            }else if(valor == 0){
                ex02.desimpilhar();
            }else{
                ex02.pushImpar(valor);
            }
        }
        
        System.out.println(ex02.toString());
        System.out.println(ex02.toStringDois());
        
        
    }
}
