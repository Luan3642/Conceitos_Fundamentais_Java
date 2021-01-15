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
public class Ex4 {

    public static void main(String[] args) {

        int populacaoPaisA = 80000;
        int populacaoPaisB = 200000;
        int anos = 0;
        
        
        while(populacaoPaisA < populacaoPaisB){
            populacaoPaisA += (populacaoPaisA/100) * 3;
            populacaoPaisB += (populacaoPaisB/100) * 1.5;
            
            anos++;
        }
        
        System.out.println("A quantidade de anos é igual: "+anos);
        
    }
        
}
