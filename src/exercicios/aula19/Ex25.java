/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula19;

/**
 *
 * @author Luan
 */
public class Ex25 {
      public static void main(String[] args) {

        String[] letras = {"x", "e", "e"};
        
        boolean palindromo = false;
        for (int i = 0; i <letras.length; i++) {
            for (int j = letras.length - 1; j>=0; j--) {
                if(letras[i] == letras[j]){
                    palindromo = true;
                } else{
                    palindromo = false;
                }
            }
        }
        
        if(palindromo){
            System.out.println("Palindromo");
        } else{
            System.out.println("Não palindromo");
        }
    }
}
