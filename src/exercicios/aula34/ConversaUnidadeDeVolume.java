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
public class ConversaUnidadeDeVolume {

    public static int converteEmCentimentroCubico(int litro) {
        return litro * 1000;
    }
    
    public static int converteLitro(int metroCubico){
        return metroCubico * 1000;
    }
    
    public static double convertePesCubico(int metroCubico){
        return metroCubico * 35.32;
    }
    
    public static int converteEmPolegadasCubicas(int galaoAmericano){
        return galaoAmericano * 231;
    }
    
    public static double converteEmLitros(int galaoAmericano){
        return galaoAmericano * 3.785;
    }
}
