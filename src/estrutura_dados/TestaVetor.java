/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrutura_dados;

/**
 *
 * @author Luan
 */
public class TestaVetor {

    public static void main(String[] args) throws Exception {
        Vetor vetor = new Vetor(10);

        try {
            vetor.adicionar("B");
            vetor.adicionar("C");
            vetor.adicionar("D");
            vetor.adicionar("E");
            vetor.adicionar("F");
            vetor.adicionar("G");

            System.out.println(vetor);

            vetor.adiciona(0, "A");

            System.out.println(vetor);

            vetor.adiciona(3, "D");

            System.out.println(vetor);
            vetor.remover(0);
            
            System.out.println(vetor);
            
            System.out.println("Tamanho: "+vetor.getTamanho());
            
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Tamanho excedido");
        }
 
//        
//        System.out.println("Quantidade de elementos do vetor: "+vetor.quantidadeElementos());
//        System.out.println("Top: "+vetor.top());
//        
//        System.out.println(vetor.toString());
//        
//        System.out.println("Elemento da posicao: "+vetor.obterElemento(0));
//        
//        System.out.println("Elemento existe?" +vetor.busca(6));
//        
//        
    }
    
    

}
