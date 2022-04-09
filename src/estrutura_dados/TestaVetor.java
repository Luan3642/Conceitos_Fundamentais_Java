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
        Vetor vetor = new Vetor(3);

        try{
            vetor.adicionar(5);
            vetor.adicionar(2);
            vetor.adicionar(5);
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Tamanho excedido");
        }

        vetor.listar();
        
        System.out.println("Quantidade de elementos do vetor: "+vetor.quantidadeElementos());

    }

}
