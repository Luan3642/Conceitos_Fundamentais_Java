/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula45;

/**
 *
 * @author Luan
 */
public class Teste {
    public static void main(String[] args) {
        System.out.println("1 - consultar um contato da agenda");
        System.out.println("2 - adicionar contato na agenda");
        
        try{
            Agenda agenda = new Agenda();
            agenda.consultar(Agenda.luan);
        }catch(Exception e ){
            System.out.println("Esse contanto não está agendado");
        }
    }
}
