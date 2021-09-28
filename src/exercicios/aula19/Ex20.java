/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula19;

public class Ex20 {

    public static void main(String[] args) {

        int paisA = 80000;
        double paisB = 200000;
        int cont =0;
        
        while(paisA < paisB){
            
            paisA = paisA + (paisA/ 100) * 3;
            paisB = paisB + (paisB/ 100) * 1.5;
            cont++;
        }
        
        System.out.println("Pais A: "+paisA);
        System.out.println("Anos: "+cont);
    }

}
