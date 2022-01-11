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
public class TestaContaCorrente {
    public static void main(String[] args) {
        
        
        ContaCorrente contaLuan = new ContaCorrente();
        
        contaLuan.depositarDinheiro(2000);
        
        System.out.println("seu saldo é: " +contaLuan.consultaSaldo());
        System.out.println("novo saldo da conta: "+contaLuan.realizarSaque(1250));
        System.out.println("é conta especial? "+contaLuan.contaEspecial(false));
    }
}
