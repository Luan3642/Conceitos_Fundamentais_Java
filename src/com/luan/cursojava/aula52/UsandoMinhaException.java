/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luan.cursojava.aula52;

/**
 *
 * @author Luan
 */
public class UsandoMinhaException {

    public static void main(String[] args) {

        int[] numeros = {4, 8, 5, 2, 2, 1, 3, 16, 32, 64, 128};
        int[] denominador = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                if (numeros[i] % 2 != 0) {
                    throw new DivisaoNaoExata(numeros[i], denominador[i]);
                }
                System.out.println(numeros[i] + " / " + denominador[i] + " = " + (numeros[i] / denominador[i]));

            } catch (ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoNaoExata e) {
                System.out.println("Aconteceu um erro");
                e.printStackTrace();
            }
        }
    }
}
