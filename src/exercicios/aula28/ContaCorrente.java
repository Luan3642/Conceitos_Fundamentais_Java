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
public class ContaCorrente {

    private int numero;
    public double saldo;
    public boolean status;
    public double limite;
    
    public ContaCorrente(boolean status, double saldo){
        this.status = status;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    public double saque(double dinheiroSacar) {
        return saldo > dinheiroSacar ? this.saldo -= dinheiroSacar : this.saldo;
    }

    public double depositar(double depositaDinheiro) {
        return this.saldo += depositaDinheiro;
    }

    public double consultaSaldo() {
        return this.saldo;
    }
    
    public boolean estaUsandoCheque(){
        return this.status;
    }

}
