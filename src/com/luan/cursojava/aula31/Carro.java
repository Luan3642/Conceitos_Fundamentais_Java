/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luan.cursojava.aula31;

/**
 *
 * @author Luan
 */
public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;
    
    
     public void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
    }

    public double obterAutonomia() {
        System.out.println("O método autonomia foi chamado");

        return capCombustivel * consumoCombustivel;
    }
    
    private double divideKmPorConsumocombustivel(double km){
        return km/this.consumoCombustivel;
    }

    public double calcularCombustivel(double km) {
        return this.divideKmPorConsumocombustivel(km);
    }
}
