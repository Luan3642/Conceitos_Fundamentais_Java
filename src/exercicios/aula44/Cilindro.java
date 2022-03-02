/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula44;

/**
 *
 * @author Luan
 */
public class Cilindro extends Figura3D implements DimensaoVolumetrica{

    
    
    private int altura;
    private int raio;

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
    
    
    public int calcularVolume(int areaBase, int altura) {
        return areaBase * altura;
    }

    

   
    
 
 


    
    
}
