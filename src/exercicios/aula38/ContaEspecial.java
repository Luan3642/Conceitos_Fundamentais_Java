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
public class ContaEspecial extends ContaBancaria {

    private double atributoLimite;

    public double getAtributoLimite() {
        return atributoLimite;
    }

    public void setAtributoLimite(double atributoLimite) {
        this.atributoLimite = atributoLimite;
    }

    @Override
    public double sacar(double valorSacar) {
        return super.saldo > valorSacar ? super.saldo = super.saldo - valorSacar : super.saldo - 0;

    }

}
