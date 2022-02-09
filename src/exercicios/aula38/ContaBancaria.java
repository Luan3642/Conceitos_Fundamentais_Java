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
public class ContaBancaria {

    private String nomeCliente;
    private int numConta;
    private double saldo;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    public double sacar(double valorSacar){
        return saldo > valorSacar ? valorSacar - saldo : saldo - 0;
        
    }
    
    public double depositar (double valorDepositar){
        return saldo + valorDepositar;
    }
    

}
