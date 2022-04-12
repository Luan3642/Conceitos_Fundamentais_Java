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

    private String[] vetor;
    private int tamanho;

    public Vetor(int capacidade) {
        vetor = new String[capacidade];
    }

    public boolean adicionar(String elemento) throws ArrayIndexOutOfBoundsException {
        this.aumentaCapacidade();
        if (this.vetor.length > this.tamanho) {
            this.vetor[tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
        return true;
    }

    public int quantidadeElementos() {
        return this.tamanho;
    }

    public String top() {
        return this.vetor[this.tamanho - 1];
    }

    public void listar() {
        for (String v : vetor) {
            System.out.println(v);
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.vetor[i]);
            s.append(", ");
        }

        if (this.tamanho > 0) {
            s.append(this.vetor[tamanho - 1]);
        }

        s.append("]");

        return s.toString();
    }

    public String obterElemento(int posicao) throws IllegalArgumentException {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        } else {
            return this.vetor[posicao];
        }

    }

    public int busca(String elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (vetor[i].equalsIgnoreCase(elemento)) {
                return i;
            }
        }
        return -1;
    }

//    public boolean adiciona(int posicao, String elemento ){
//        if(!(posicao >= 0 && posicao <tamanho)){
//            throw new IllegalArgumentException("Posição inválida");
//        }
//        
//        for (int i = this.tamanho-1; i >=posicao; i--) {
//            this.vetor[i+1] = this.vetor[i];
//        }
//        
//        this.vetor[posicao] = elemento;
//        this.tamanho++;
//                
//        return true;
//    }
    // TAMANHO: 
    // 0 1 2 3 4
    // B C D - - 
    public boolean adiciona(int posicao, String elemento) {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        
        this.aumentaCapacidade();
        
        for (int i = this.tamanho-1; i >=posicao; i--) {
            this.vetor[i+1] = this.vetor[i];
        }
        
        this.vetor[posicao] = elemento;
        return true;
    }
    
    
    private void aumentaCapacidade(){
        if (this.tamanho == this.vetor.length){
           String[] vetorNovo = new String[this.vetor.length * 2]; 
            for (int i = 0; i <this.vetor.length; i++) {
                vetorNovo[i] = this.vetor[i];
            }
            
            this.vetor = vetorNovo;
        }
    }
}