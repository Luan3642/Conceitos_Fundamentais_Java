/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturaDadosPilhaListaEtc;

/**
 *
 * @author luan
 */
public class EstruturaEstatica<T> {

    private T[] elementos;
    private int tamanho;

    public EstruturaEstatica() {
        this(10);
    }

    public EstruturaEstatica(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    protected boolean adiciona(T elemento) {
        if ((this.tamanho < this.elementos.length)) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }

        return false;
    }

    public void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] vetorNovo = (T[]) new String[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                vetorNovo[i] = this.elementos[i];
            }

            this.elementos = (T[]) vetorNovo;
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho > 0) {
            s.append(this.elementos[tamanho - 1]);
        }

        s.append("]");

        return s.toString();
    }

    public boolean adicionarElementoQualquerPosicao(T element, int posicao) {
        if (!(posicao >= 0 && posicao <= this.tamanho)) {
            throw new IllegalArgumentException("Posição inválida");

        }

        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }

        this.elementos[posicao] = element;
        this.tamanho++;

        return true;
    }
}
