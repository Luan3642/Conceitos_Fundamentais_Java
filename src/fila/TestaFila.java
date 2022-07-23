/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fila;

/**
 *
 * @author luan
 */
public class TestaFila {

    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);

        System.out.println(fila);
//        System.out.println("Tamaho da fila: "+ fila.tamanho());
//        System.out.println("Fila esta vazio? "+fila.empty());

       
        fila.defenfileira();
        System.out.println(fila);

       
//        System.out.println(fila);

//        System.out.println("Quem e o primeiro da fila? " + fila.espiar());
//        fila.enfileira(4);
//        System.out.println(fila);

    }

}
