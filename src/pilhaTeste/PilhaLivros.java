/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilhaTeste;

import java.util.Scanner;

/**
 *
 * @author luan
 */
public class PilhaLivros {

    
    Scanner scan = new Scanner(System.in);
    private Object pilha[] = new Object[2];
    private int tamanho;

//    private Object[][] livros = new Object[6][4];
    
    
    public void push(){
        if(!(this.tamanho < pilha.length)){
            throw new IllegalArgumentException("ERRO");
        }
        
        for (int i = 0; i < pilha.length; i++) {
            System.out.println("Digite o nome livro");
            this.pilha[this.tamanho] = scan.nextLine();
            
            System.out.println("Digite o ISBN");
            this.pilha[this.tamanho] = scan.nextLine();
            
             System.out.println("Digite o ano lancamento");
            this.pilha[this.tamanho] = scan.nextLine();
            
            System.out.println("Digite o autor");
            this.pilha[this.tamanho] = scan.nextLine();
            this.tamanho++;
        }
        
    }
    
    public String toString(){
        StringBuilder s = new StringBuilder();
        
        s.append("[");
        
        for (int i = 0; i < this.tamanho-1; i++) {
            s.append(this.pilha[i]);
            s.append(",");
        }
        
        if(this.tamanho > 0){
            s.append(pilha[tamanho-1]);
        }
        s.append("]");
        
        return s.toString();
    }
    

}
