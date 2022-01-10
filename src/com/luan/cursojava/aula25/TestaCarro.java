/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luan.cursojava.aula25;

/**
 *
 * @author Luan
 */
public class TestaCarro {
    public static void main(String[] args) {

        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;
        
        
        System.out.println(van.marca);
        System.out.println(van.modelo);
        
        van.exibirAutonomia();
        
  
    }
}
