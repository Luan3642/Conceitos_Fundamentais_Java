/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luan.cursojava.aula50;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luan
 */
public class UsandoThrows {
    public static void main(String[] args) {
        System.out.println("Entre com um valor");
        try {
            double num = lerNumero();
            System.out.println("Você digitou um: "+num);
        } catch (Exception ex) {
            System.out.println("Entrada inválida");
        }
    }
    
    public static double lerNumero() throws Exception{
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        return num;
    }
}
