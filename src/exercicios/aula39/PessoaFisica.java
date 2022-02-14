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
public class PessoaFisica extends Contribuintes{
    public void calcular(double rendimento){
        
        if(rendimento <= 2100){
            System.out.println(rendimento - (rendimento * 0.1) );
        } else if (rendimento >= 2100 && rendimento <= 2800){
            System.out.println( rendimento -(rendimento * 0.15) );
        } else if (rendimento >= 2800.01 && rendimento <=3600){
            System.out.println(  (rendimento * 0.25) );
        } else if (rendimento > 3600.01){
            System.out.println(rendimento - (rendimento * 0.3) );
        }
    }
}
