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
public class TestaLampada {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        
        lampada.setFaixaCores("16 Milhões");
        lampada.setFuncionando(true);
        lampada.setMarca("Kabum Smart");
        lampada.setModelo(10);
        lampada.setVoltagem("Bivolt");
        
        
        System.out.println("Faixa de cores: "+lampada.getFaixaCores());
        System.out.println("Está funcionando: "+lampada.getFuncionando());
        System.out.println("Marca: "+lampada.getMarca());
        System.out.println("Modelo: "+lampada.getModelo());
        System.out.println("Voltagem: "+lampada.getVoltagem());
    }
}
