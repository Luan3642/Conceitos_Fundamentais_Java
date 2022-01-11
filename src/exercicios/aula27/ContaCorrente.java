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
public class ContaCorrente {

    public int numero;
    public double saldo;
    public boolean status;
    public double limite;

    public double realizarSaque(double saque) {
        return saldo > saque ? saldo - saque : saldo + 0;
    }

    public double depositarDinheiro(double dinheiro) {
        return this.saldo += dinheiro;
    }

    public double consultaSaldo() {
        return saldo;
    }

    public boolean contaEspecial(boolean contaStatus) {
        return status = contaStatus;
    }

}
