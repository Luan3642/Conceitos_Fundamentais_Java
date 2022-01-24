/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula34;

/**
 *
 * @author Luan
 */
public class TestaConversao {
    public static void main(String[] args) {
        System.out.println("Dois acres, igual tantos pé quadrados: "+ConversaoUnidades.acre(2));
        System.out.println("Dois metro quadrado, igual tantos metro quadrado: "+ConversaoUnidades.metroQuadrado(2));
        System.out.println("Duas milha quadrada, igual tantos acres: "+ConversaoUnidades.milhaQuadrada(2));
        System.out.println("Dois pe quadrado, igual tantos centrimetros quadrados: "+ConversaoUnidades.peQuadrado(2));
    }
}
