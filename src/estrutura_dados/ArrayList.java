/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estrutura_dados;

import java.util.Collections;

/**
 *
 * @author luan
 */
public class ArrayList {

    public static void main(String[] args) {
        java.util.ArrayList<String> pilha = new java.util.ArrayList<>();
        
        pilha.add("volvo");
        pilha.add("lancer");
        pilha.add("hyndai");
        
        System.out.println(pilha);
        
        pilha.set(1, "luan");
//        System.out.println(pilha.get(2));
        System.out.println(pilha);
        pilha.remove(0);
        System.out.println(pilha);
//        pilha.clear();
        System.out.println(pilha);
        System.out.println("O tamanho é: " + pilha.size());
        
        Collections.sort(pilha);
//        
//        for (int i = 0; i < pilha.size(); i++) {
//            System.out.println(pilha.get(i));
//        }
        
        for (Object object : pilha) {
            System.out.println(object);
        }
        
    }
}
