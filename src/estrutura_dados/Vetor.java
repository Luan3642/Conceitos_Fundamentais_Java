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
public class Vetor {

    private int[] vetor;
    private int tamanho;

    public Vetor(int capacidade) {
        vetor = new int[capacidade];
    }
    
    public void adicionar(int numero) throws ArrayIndexOutOfBoundsException{
       if(this.vetor.length > this.tamanho){
           this.vetor[tamanho] = numero;
           this.tamanho++;
       } else{
           throw new ArrayIndexOutOfBoundsException();
       }
    }
    
    public  int quantidadeElementos(){
        return this.tamanho;
    }
    
    public void listar(){
        for(int v: vetor){
            System.out.println(v);
        }
    }
    
}
