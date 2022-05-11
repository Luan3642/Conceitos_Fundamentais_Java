/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estrutura_dados;

import java.util.Arrays;

/**
 *
 * @author luan
 */
public class VetorNew {

    private int[] vetor;
    private int tamanho;

    public VetorNew(int capacidade) {
        vetor = new int[capacidade];
        this.tamanho = 0;
    }

//    public void adicionarElemento(int elemento) throws Exception{
//        if(this.tamanho < this.vetor.length){
//            vetor[tamanho] = elemento;
//            tamanho++;
//        } else{
//            throw new Exception("Vetor já está cheio não é possível adicionar mais elementos");
//        }
//    }
    public boolean adicionarElemento(int elemento) {
        if (this.tamanho < this.vetor.length) {
            this.vetor[tamanho] = elemento;
            this.tamanho++;
        } 
        return false;
    }

    public int capacidadeVetor() {
        return this.vetor.length;
    }

    public int tamanhoRealVetor() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        
        s.append("[");
        for (int i = 0; i <this.tamanho-1; i++) {
            s.append(this.vetor[i]);
            s.append(",");
        }
        
        if(this.tamanho > 0){
            s.append(this.vetor[this.tamanho-1]);
        }
        
        s.append("]");
        return s.toString();
    }
    
    
    public int busca(int posicaoDesejada) throws Exception{
        if(this.tamanho > posicaoDesejada && posicaoDesejada >=0){
            return this.vetor[posicaoDesejada];
        }
        throw new Exception("Posiçao inválida");
       
    }
    
    
    public boolean elementoExiste(int elemento){
        for (int i = 0; i <vetor.length; i++) {
            if(vetor[i] == elemento){
                return true;
            }
        }
        return false;
    }
    
    
//    public void adicionarElementoQualquerPosicao(int elemento, int posicao){
//        if(!(posicao < this.vetor.length && posicao >=0)){
//            throw new Exception("Posição inválida");
//        }
//        
//        
//    }
}
