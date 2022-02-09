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
public class CountaPoupanca extends ContaBancaria{
    private int diaRendimento;

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
    
    public double calcularNovoSaldo(double taxaRendimento){
        
        return taxaRendimento * this.getSaldo();
        
    }
    
    
}
