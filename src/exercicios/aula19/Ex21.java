/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula19;

/**
 *
 * @author Luan
 */
public class Ex21 {
    public static void main(String[] args) {
        double[] vetorA = new double[20];

        for (int i = 0; i <vetorA.length; i++) {
            vetorA[i] = 5.43 * i;
        }
        
        
        for (double d : vetorA) {
            System.out.println(d);
        }
        
    }
}
