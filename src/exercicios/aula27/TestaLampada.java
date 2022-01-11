/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula27;

/**
 *
 * @author Luan
 */
public class TestaLampada {
    public static void main(String[] args) {
        
        Lampada lampada= new Lampada();
        Lampada lampadaAzul = new Lampada();
        boolean statusLampadaVermelha = lampada.ligarLampada(false);
        boolean statusLampadaAzul = lampada.ligarLampada(true);
        
        
        
        System.out.println("A lampada vermelha está ligada? "+statusLampadaVermelha);
        System.out.println("A lampada azul está ligada? "+statusLampadaAzul);
    }
}
