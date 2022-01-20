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
public class Contador {
    static int contador;
    
    public Contador(){
        contador++;
    }
    
    public static int zerar(){
        return contador *=0;
    }
    
    public int retornar(){
        return contador;
    }
}
