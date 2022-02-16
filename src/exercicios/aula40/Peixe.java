/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula40;

/**
 *
 * @author Luan
 */
public class Peixe extends  Animal{
    private String caracteristicas;
    
    public void setCaracteristicas(String caracteristicas){
        this.caracteristicas = caracteristicas;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }
    
    

    @Override
    public String toString() {
        return "Animal{" + "nome=" + getNome() + ", comprimento=" + getComprimento() + ", numeroPatas=" + getNumeroPatas() + ", cor=" + getCor() + ", ambiente=" + getAmbiente() + ", velocidade=" + getVelocidade() +", caracteristicas " +getCaracteristicas() +'}';
    }
    
    
    
}
