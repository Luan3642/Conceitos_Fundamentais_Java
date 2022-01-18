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
public class TestaBanco {
    public static void main(String[] args) {
        
        ContaCorrente contaCorrente = new ContaCorrente(true, 2000);
        
        contaCorrente.saque(500);
        
        System.out.println("Saldo: "+contaCorrente.consultaSaldo());
        
        contaCorrente.depositar(5000);
        System.out.println("Está usando cheque? "+contaCorrente.estaUsandoCheque());
        
        System.out.println("Novo saldo depois do deposito: "+contaCorrente.consultaSaldo());
    }
}
