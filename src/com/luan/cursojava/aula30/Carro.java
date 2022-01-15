/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luan.cursojava.aula30;

/**
 *
 * @author Luan
 */
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

    public Carro(String marca, String modelo) {
        this("Fiat", "Ducato" , 10);
    }

    public Carro(){
    }

    public Carro(String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
    }

    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }
    
    

    public Carro(String marca_) {
        this.marca = marca_;
    }

    public void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
    }

    public double obterAutonomia() {
        System.out.println("O método autonomia foi chamado");

        return capCombustivel * consumoCombustivel;
    }

    public double calcularCombustivel(double km) {
        double qtdCombustivel = km / consumoCombustivel;

        return qtdCombustivel;
    }
}
