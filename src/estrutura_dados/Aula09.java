/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estrutura_dados;

/**
 *
 * @author luan
 */
public class Aula09 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);
        
        vetor.adicionar("B");
        vetor.adicionar("G");
        vetor.adicionar("D");
        vetor.adicionar("E");
        vetor.adicionar("F");
        
        System.out.println(vetor);
        
        vetor.deletar(1);
        
        System.out.println(vetor);
        
        System.out.println("Remover o elemento E");
        
        int pos = vetor.busca("E");
        
        
        if(pos > -1){
           vetor.deletar(pos); 
        } else{
            System.out.println("Posição inválida");
        }
        
        System.out.println(vetor);
        
    }
}
