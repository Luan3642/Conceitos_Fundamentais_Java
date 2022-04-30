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
        } else {
            return false;
        }

        return true;
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
}
