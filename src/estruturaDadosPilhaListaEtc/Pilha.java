/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturaDadosPilhaListaEtc;

/**
 *
 * @author luan
 */
public class Pilha<T> extends EstruturaEstatica<T>{
    
    
    public Pilha(){
        super();
    }
    
    public Pilha(int capacidade){
        super(capacidade);
    }
    
    public void empilha(T elemento){
       super.adiciona(elemento);
    }
}
