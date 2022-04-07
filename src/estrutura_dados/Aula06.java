/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estrutura_dados;

/**
 *
 * @author luan
 */
public class Aula06 {

    public static void main(String[] args) {
        Vetor vetor = new Vetor(2);

        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");
        
        System.out.println(vetor.busca("Elemento 1"));
    }

}
