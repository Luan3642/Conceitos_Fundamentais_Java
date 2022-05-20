/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturaDadosPilhaListaEtc;

/**
 *
 * @author luan
 */
public class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha() {
        super();
    }

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public void empilhar(T elemento) {
        if (!(tamanho < elementos.length)) {
            throw new IllegalArgumentException("ERRO");
        }
        this.elementos[tamanho] = elemento;
        this.tamanho++;
    }

    public boolean empty() {
        return tamanho == 0 ? true : false;
    }

    public T topoPilha() {

        if (empty()) {
            return null;
        }
        return elementos[this.tamanho - 1];
    }

    public T desimpilhar() {

        
        T elemento = this.elementos[this.tamanho-1];
        this.tamanho--;
        
        return elemento;
    }
    

}
