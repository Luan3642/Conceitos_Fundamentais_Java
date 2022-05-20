/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilhaTeste;

import java.util.Arrays;

/**
 *
 * @author luan
 */
public class Ex01 {

    private int tamanho;
    private int[] pilha;

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int[] getPilha() {
        return pilha;
    }

    public void setPilha(int[] pilha) {
        this.pilha = pilha;
    }

    
    
    public Ex01() {
        this.pilha = new int[10];
    }

    public void adicionarElemento(int elemento) {

//        if(!(this.tamanho < this.pilha.length)){;
//            throw new IllegalArgumentException("Você estorou a capacidade");
//        }
        this.pilha[tamanho] = elemento;
        this.tamanho++;

    }

    public int desimpilhar() throws IllegalArgumentException{
        if (vazio()) {
            throw new IllegalArgumentException("Está vazia");
        }
        int elemento = this.pilha[this.tamanho - 1];
        this.tamanho--;
        
        return elemento;
    }

    public boolean vazio() {
        return this.tamanho == 0;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.pilha[i]);
            s.append(", ");
        }

        if (this.tamanho > 0) {
            s.append(this.pilha[tamanho - 1]);
        }

        s.append("]");

        return s.toString();
    }

}
