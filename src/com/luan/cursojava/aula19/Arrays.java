/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luan.cursojava.aula19;

import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        double[] temperaturaDiaria = new double[365];
        
        
       temperaturaDiaria[0] = 36.4;
       
       
       temperaturaDiaria[5] = 54.5;
       
       
        System.out.println("O valor da temperatura do primeiro dia é: "+temperaturaDiaria[0]);
        
        System.out.println("O tamanho do array é: "+temperaturaDiaria.length);
        
        
        // acesso somente ao valor da variável
        for(double i : temperaturaDiaria){
            System.out.println(i);
        }
        
        
        // acesso ao valor e ao indice dese valort
        for(int i = 0; i<temperaturaDiaria.length; i++){
            System.out.println(temperaturaDiaria[i]);
        }
    }
}
