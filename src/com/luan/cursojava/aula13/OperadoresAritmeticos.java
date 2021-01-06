/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luan.cursojava.aula13;

/**
 *
 * @author luan3
 */
public class OperadoresAritmeticos {
    public static void main(String[] args) {
        
        
        int resultado  = 1 + 2;
        System.out.println("O resultado é: "+resultado);
        
        resultado = resultado - 1;
        
        System.out.println("O novo resultado é: "+resultado);
        
        resultado = resultado * 2;
        
        System.out.println("O novo resultado é: "+resultado);
        
        
        resultado = resultado / 2;
        
        System.out.println("O mais novo resultado é: " +resultado);
        
        resultado = resultado + 8;
        
        System.out.println("O resultado mais preciso é: "+resultado);
        
        resultado = resultado %7;
        
        System.out.println("o módulo é:"+ resultado);
        
        String primeiroNome = "Está é";
        String segundoNome = " uma String concatenada";
        String terceiroNome = primeiroNome + segundoNome;
        System.out.println(terceiroNome);
        
        
        resultado = resultado +1;
        resultado--;
        
        System.out.println(resultado);
        
        System.out.println(resultado++);
        System.out.println(++resultado);
        
        
    }
    
}
