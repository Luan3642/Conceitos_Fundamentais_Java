/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula28;

/**
 *
 * @author Luan
 */
public class TesteLampada {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        
        lampada.setLigada(false);
        
        System.out.println("A lampada está ligada? " +lampada.getLigada());
    }
}
