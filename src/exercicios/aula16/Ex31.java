/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula16;

import java.util.Calendar;

public class Ex31 {

    public static void main(String[] args) {

      

        double salario = 1000;
        
        
        double percentual = 1.5;
        
        
        salario = salario + (salario /100) * 1.5;
        
        
        for (int i = 1997; i < 2021; i++) {
            
            percentual = percentual * 2;
            
            salario = salario + (salario/100) * percentual;
            
            System.out.println(i+ " = " + salario + " - " + percentual + "%");
            
        }
        
    

    }

}
