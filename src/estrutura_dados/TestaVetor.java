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

    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);

        try{
            vetor.adicionar(5);
            vetor.adicionar(6);
            vetor.adicionar(9);
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Tamanho excedido");
        }
        
        
        System.out.println("Quantidade de elementos do vetor: "+vetor.quantidadeElementos());
        System.out.println("Top: "+vetor.top());
        
        System.out.println(vetor.toString());
        
        System.out.println("Elemento da posicao: "+vetor.obterElemento(0));
        
    }

}
