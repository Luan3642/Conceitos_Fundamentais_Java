/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estrutura_dados;

/**
 *
 * @author luan
 */
public class Aula8 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);

        try {
            vetor.adicionar("B");
            vetor.adicionar("C");
            vetor.adicionar("D");
            vetor.adicionar("E");
            vetor.adicionar("F");
            vetor.adicionar("G");

            System.out.println(vetor);


        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Tamanho excedido");
        }
    }
}
