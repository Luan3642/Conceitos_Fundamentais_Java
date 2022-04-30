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
        VetorNew vetorNew = new VetorNew(4);

        vetorNew.adicionarElemento(4);
        vetorNew.adicionarElemento(2);
        vetorNew.adicionarElemento(1);

        

        System.out.println(vetorNew);
        System.out.println("Capacidade: " + vetorNew.capacidadeVetor());
        System.out.println("Tamanho real: " + vetorNew.tamanhoRealVetor());

    }
}
