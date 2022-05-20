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
        
        Pilha<Integer> pilha = new Pilha(4);
        
      
        
        pilha.empilhar(1);
        pilha.empilhar(2);
        pilha.empilhar(3);
        pilha.empilhar(5);
//        pilha.empilhar(6);
        
        
        System.out.println(pilha);
        System.out.println(pilha.getTamanho());
        
        System.out.println("Está vazio? "+pilha.empty());
        
        System.out.println("Topo da pilha: "+pilha.topoPilha());
    }
}
