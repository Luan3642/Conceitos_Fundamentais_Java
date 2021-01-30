/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula16;

/**
 *
 * @author luan3
 */
public class Ex23 {
    public static void main(String[] args) {
        double preco = 1.99;
        double valorTabela;
        
        for (int i = 1; i <=50; i++) {
            System.out.println(i + " - R$ " + preco * i);
        }
    }
}
