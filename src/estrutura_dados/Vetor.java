/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrutura_dados;

import java.util.Arrays;

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
    
    public int top(){
        return this.vetor[this.tamanho-1];
    }
    
    public void listar(){
        for(int v: vetor){
            System.out.println(v);
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        
        
        for (int i = 0; i <this.tamanho-1; i++) {
            s.append(this.vetor[i]);
            s.append(", ");
        }
        
        if(this.tamanho > 0){
            s.append(this.vetor[tamanho-1]);
        }
        
        s.append("]");
        
        return s.toString();
    }
    
    
    public int obterElemento(int posicao) throws IllegalArgumentException{
       if(!(posicao >=0 && posicao < tamanho)){
           throw new IllegalArgumentException("Posição inválida");
       } else{
           return this.vetor[posicao];
       }
        
    }
    
    public int busca(int elemento){
        for (int i = 0; i <this.tamanho; i++) {
            if(vetor[i] == elemento){
                return i;
            }
        }
        return -1;
    }

    
    
    
    
    
}
