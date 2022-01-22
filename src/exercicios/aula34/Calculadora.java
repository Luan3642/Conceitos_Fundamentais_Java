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
public class Calculadora {

    public static int somar(int n1, int n2) {
        return n1 + n2;
    }

    public static int subtrair(int n1, int n2) {
        return n1 - n2;
    }

    public static int multiplicar(int n1, int n2) {
        return n1 * n2;
    }

    public static int dividir(int n1, int n2) {
        return n1 / n2;
    }

    public static double potencia(double n1) {
        return Math.pow(n1, 2);
    }

    public static int fatorial(int n) {
        int x = n;
        for (int i = n; i >= 2; i--) {
            x = x * (i-1); 
        }
        return x == 0 ? 1 : x;
    }

}
