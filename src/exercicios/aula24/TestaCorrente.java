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
public class TestaCorrente {
    public static void main(String[] args) {
        
        ContaCorrente contaCorrente = new ContaCorrente();
        
        contaCorrente.setLimite(5000.20);
        contaCorrente.setNumero(5750);
        contaCorrente.setSaldo(6000);
        contaCorrente.setStatus("especial");
        
        System.out.println("Limite: "+contaCorrente.getLimite());
        System.out.println("Número: "+contaCorrente.getNumero());
        System.out.println("Saldo: "+contaCorrente.getSaldo());
        System.out.println("Especial? "+contaCorrente.getStatus());
    }
}
