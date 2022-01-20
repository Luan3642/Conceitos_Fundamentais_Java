/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula34;

/**
 *
 * @author Luan
 */
public class TestaContador {
    public static void main(String[] args) {
        
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        
        System.out.println("Quantidade contador: "+c1.retornar());
        System.out.println("Zerar contador: "+c2.zerar());
    }
}
