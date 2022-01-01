/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula20;

import java.util.Scanner;

/**
 *
 * @author Luan
 */
public class Ex5 {

    public static String compromisso[][][] = new String[13][32][25];
    
    public void agendarCompromisso(int mes, int dia, int hora, String tarefa){
         for (int i = 0; i <compromisso.length; i++) {
            for (int j = 0; j <compromisso[i].length; j++) {
                for (int k = 0; k <compromisso[i][j].length; k++) {
                    if(k <= 8){
                        compromisso[mes][dia][hora] = tarefa;

                    }
                }
            }
        }
        
    }
    
    public String pesquisarCompromisso(int mes, int dia, int hora){
        int auxMes =0, diaAux =0, auxHora =0;
        
        for (int i = 0; i <compromisso.length; i++) {
            for (int j = 0; j <compromisso[i].length; j++) {
                for (int k = 0; k <compromisso[i][j].length; k++) {
                    auxHora = k;
                }
            }
        }
        return ("Tarefa: "+compromisso[mes][dia][hora] + " Horário: "+auxHora);
    }
    public static void main(String[] args) {
        
    }
}
