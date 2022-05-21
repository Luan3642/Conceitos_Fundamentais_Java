/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilhaTeste;

/**
 *
 * @author luan
 */
public class Ex02 {
    private int[] pilhaPar = new int[10];
    private int[] pilhaImpar = new int[10];
    private int tamanhoPar;
    private int tamanhoImpar;
    
    
    public void pushPar(int elemento){
        if(!(this.tamanhoPar < this.pilhaPar.length)){
            throw new IllegalArgumentException("Valor inválido");
        }
        this.pilhaPar[this.tamanhoPar] = elemento;
        this.tamanhoPar++;
    }
    
    public void pushImpar(int elemento){
        if(!(this.tamanhoImpar < this.pilhaImpar.length)){
            throw new IllegalArgumentException("Valor inválido");
        }
        
        this.pilhaImpar[this.tamanhoImpar] = elemento;
        this.tamanhoImpar++;
    }
    
    public boolean vazio(){
        return this.tamanhoImpar == 0|| this.tamanhoPar == 0;
    }
    
    public void desimpilhar(){
        if(vazio()){
            System.err.println("ERRO");
        }
        tamanhoPar--;
        tamanhoImpar--;
    }
    
    public String toString(){
        StringBuilder s = new StringBuilder();
  
        s.append("[");
        
        for (int i = 0; i <this.tamanhoPar -1; i++) {
            s.append(pilhaPar[i]);
            s.append(",");
        }
        
        if(this.tamanhoPar > 0){
            s.append(this.pilhaPar[this.tamanhoPar-1]);
        }
        
        s.append("]");
        
        return s.toString();
    }
 
    public String toStringDois(){
        StringBuilder s = new StringBuilder();
  
        s.append("[");
        
        for (int i = 0; i <this.tamanhoImpar -1; i++) {
            s.append(pilhaImpar[i]);
            s.append(",");
        }
        
        if(this.tamanhoImpar > 0){
            s.append(this.pilhaImpar[this.tamanhoImpar-1]);
        }
        
        s.append("]");
        
        return s.toString();
    }
}
