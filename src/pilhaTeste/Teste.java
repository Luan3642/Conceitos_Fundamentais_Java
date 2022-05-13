/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilhaTeste;

import estruturaDadosPilhaListaEtc.Pilha;

/**
 *
 * @author luan
 */
public class Teste {
    public static void main(String[] args) {
       Pilha<Integer> pilha = new Pilha<>();
        
       
        for (int i = 0; i < 10; i++) {;
            pilha.empilha(i);
        }

        System.out.println("Vazio? "+pilha.isEmpty());
        
        System.out.println(pilha);
        System.out.println(pilha.getTamanho());
        
    }
}
