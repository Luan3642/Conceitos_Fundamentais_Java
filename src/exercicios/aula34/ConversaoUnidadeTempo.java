/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula34;

/**
 *
 * @author Luan
 */
public class ConversaoUnidadeTempo {
    public static int converteMinutoEmSegundo(int minuto){
         return minuto * 60;
    }
    
    public static int converteHoraEmMinutos(int hora){
        return hora * 60;
    }
    
    public static int converteDiaEmHora (int dia){
        return dia * 24;
    }
    
    public static int converteSemanaEmDia(int semana){
        return semana * 7;
    }
    
    public static int converteMesEmDia(int mes){
        return mes * 30;
    }
    
    public static int converteAnoEmDia(int ano){
        return ano * 365;
    }
}
