/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luan.cursojava.aula49;

/**
 *
 * @author Luan
 */
public class TestandoFinally {
     public static void main(String[] args) {

        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denominador = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + " / " + denominador[i] + " = " + (numeros[i] / denominador[i]));

            } catch (ArithmeticException e) {
                System.out.println("Erro a dividir por zero");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Posição do array inválida");
            }
            
            finally{
                System.out.println("Essa linha é impressa após o try ou o catch");
            }
        }
    }
}
