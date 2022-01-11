/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luan.cursojava.aula26;

/**
 *
 * @author Luan
 */
public class TesteCarro {
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
        
        double autonomia = van.obterAutonomia();
        System.out.println("Autonomia do carro é: "+autonomia);
        System.out.println("Autonomia do carro é: "+ van.obterAutonomia());
    }
}
