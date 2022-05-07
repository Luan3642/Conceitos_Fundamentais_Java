/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estrutura_dados;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luan
 */
public class NovoTeste {

    public static void main(String[] args) {
        try {
            VetorNew vetorNew = new VetorNew(4);
            
            vetorNew.adicionarElemento(4);
            vetorNew.adicionarElemento(2);
            vetorNew.adicionarElemento(1);
            
            
            
            System.out.println(vetorNew);
            System.out.println("Capacidade: " + vetorNew.capacidadeVetor());
            System.out.println("Tamanho real: " + vetorNew.tamanhoRealVetor());
            
            System.out.println("Qual posição que você deseja descobrir o valor? " +vetorNew.busca(0));
            
            System.out.println("Elemento existe? "+ vetorNew.elementoExiste(666));
        } catch (Exception ex) {
            Logger.getLogger(NovoTeste.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
