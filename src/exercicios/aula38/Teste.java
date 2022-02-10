/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula38;

/**
 *
 * @author Luan
 */
public class Teste {

    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        ContaEspecial contaEspecial = new ContaEspecial();
        CountaPoupanca contaPoupanca = new CountaPoupanca();

        contaBancaria.depositar(5000);
        contaBancaria.sacar(1000);
        
        contaEspecial.depositar(6000);
        contaEspecial.sacar(1000);
        
        contaPoupanca.depositar(7000);
        

        System.out.println("O saldo da conta bancaria é: " + contaBancaria.getSaldo());
        System.out.println("O saldo da conta especial é: " + contaEspecial.getSaldo());
        System.out.println("O novo saldo é: " + contaPoupanca.calcularNovoSaldo(5));
        
        contaBancaria.setNomeCliente("luan");
        System.out.println("Nome cliente: "+contaBancaria.getNomeCliente());
        contaBancaria.setNumConta(55555);
        System.out.println("Número da conta: "+contaBancaria.getNumConta());
    }
}
