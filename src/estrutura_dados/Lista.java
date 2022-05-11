/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estrutura_dados;

import java.lang.reflect.Array;

/**
 *
 * @author luan
 */
public class Lista<T> {
    
    private T[] vetor;
    private int tamanho;

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    

    public Lista(int capacidade) {
        vetor = (T[])new String[capacidade];
    }
    
      public Lista(int capacidade, Class<T> tipoClasse) {
        this.vetor = (T[]) Array.newInstance(tipoClasse, capacidade);
    }

    public boolean adicionar(T elemento) throws ArrayIndexOutOfBoundsException {
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

    public Object top() {
        return this.vetor[this.tamanho - 1];
    }

    public void listar() {
        for (Object v : vetor) {
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

    public Object obterElemento(int posicao) throws IllegalArgumentException {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        } else {
            return this.vetor[posicao];
        }

    }

    public int busca(String elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (vetor[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

//    public int metodoRemover(int posicao) {
//        if(!(posicao > this.tamanho && posicao < this.tamanho)){
//            throw new IllegalArgumentException("Erro");
//        }
//        
//    }

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
    public boolean adiciona(int posicao, T elemento) {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        this.aumentaCapacidade();

        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.vetor[i + 1] = this.vetor[i];
        }

        this.vetor[posicao] = elemento;
        return true;
    }

    private void aumentaCapacidade() {
        if (this.tamanho == this.vetor.length) {
            T[] vetorNovo = (T[]) new String[this.vetor.length * 2];
            for (int i = 0; i < this.vetor.length; i++) {
                vetorNovo[i] = this.vetor[i];
            }

            this.vetor = vetorNovo;
        }
    }

    // 
    // A B C D E F
    // 0 1 2 3 4 5
    public void deletar(int posicao) {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("ERRO");
        } else {
            for (int i = posicao; i < this.tamanho - 1; i++) {
                //  1 = 2
                // 2 = 3
                vetor[i] = vetor[i + 1];
                // C   B  
                // D   C
            }
            this.tamanho--;
        }

    }
    
    
   public boolean adicionarElementoQualquerPosicao(T element, int posicao){
       if(!(posicao >= 0 && posicao <= this.tamanho)){
           throw new IllegalArgumentException("Posição inválida");

       }
       
       for (int i = this.tamanho-1; i >=posicao; i--) {
           this.vetor[i+1] = this.vetor[i];
       }
       
       this.vetor[posicao] = element;
       this.tamanho++;
       
       return true;
   }
   
   public void aumentarCapacidade(){
       if(!(this.tamanho == this.vetor.length)){
           System.out.println("Não precisa aumentar capacidade");
       }else{
           T[] vetorNovo = (T[])new String[this.vetor.length];
           for (int i = 0; i < vetor.length; i++) {
               vetorNovo[i] = vetor[i];
           }
           this.vetor = vetorNovo;
       }
   }
   
   public void remover(int posicao) throws Exception{
       
       if(!(posicao >=0 && posicao <=this.tamanho)){
           throw new Exception("Posição inválida");
       }
       for (int i = posicao; i <this.tamanho-1; i++) {
           this.vetor[i] = this.vetor[i+1];
       }
       
       this.tamanho--;
   }
}
