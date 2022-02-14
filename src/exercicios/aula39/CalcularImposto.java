/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula39;

/**
 *
 * @author Luan
 */
public class CalcularImposto {

    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.calcular(3000);
        pessoaFisica.calcular(1000);
        pessoaFisica.calcular(4000);
        
        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.calcular(1000);
        pessoaJuridica.calcular(5000);
        pessoaJuridica.calcular(10000);
    }

}
