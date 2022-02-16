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
public class Mamifero extends Animal{
    private String alimento;
    
    public void setAlimento(String alimento){
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }
    
    

     @Override
    public String toString() {
        return "Animal{" + "nome=" + getNome() + ", comprimento=" + getComprimento() + ", numeroPatas=" + getNumeroPatas() + ", cor=" + getCor() + ", ambiente=" + getAmbiente() + ", velocidade=" + getVelocidade() +", alimento " +getAlimento()+'}';
    }
    
}
