/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula28;

/**
 *
 * @author Luan
 */
public class Lampada {
    private int voltagem;
    private String modelo;
    private boolean ligada;
    
    public void setVoltagem(int voltagem){
        this.voltagem = voltagem;
    }
    
    public int getVoltagem(){
        return this.voltagem;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setLigada(boolean ligada){
        this.ligada = ligada;
    }
    
    public boolean getLigada(){
        return this.ligada;
    }
    
    public boolean estadaLigada(boolean pergunta){
       return this.ligada = pergunta;
    }
    
}
