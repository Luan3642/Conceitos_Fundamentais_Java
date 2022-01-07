/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula24;

/**
 *
 * @author Luan
 */
public class Lampada {
    private String marca;
    private boolean funcionando;
    private int modelo;
    private String faixaCores;
    private String voltagem;
    
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public void setFuncionando(boolean funcionando){
        this.funcionando = funcionando;
    }
    
    public boolean getFuncionando(){
        return this.funcionando;
    }
    
    public void setModelo(int modelo){
        this.modelo = modelo;
    }
    
    public int getModelo(){
        return this.modelo;
    }
    
    public void setFaixaCores(String faixaCores){
        this.faixaCores = faixaCores;
    }
    
    public String getFaixaCores(){
        return this.faixaCores;
    }
    
    public void setVoltagem(String voltagem){
        this.voltagem = voltagem;
    }
    
    public String getVoltagem(){
        return this.voltagem;
    }

}

