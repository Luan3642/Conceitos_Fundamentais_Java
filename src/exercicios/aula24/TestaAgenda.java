/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula24;

/**
 *
 * @author Luan
 */
public class TestaAgenda {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        
        agenda.setCelular("41 9 9789-2992");
        agenda.setEmail("luan3642@hotmail.com");
        agenda.setNome("Luan Magalhães");
        
        System.out.println("celular: "+agenda.getCelular());
        System.out.println("Email: "+agenda.getEmail());
        System.out.println("Nome: "+agenda.getNome());
    }
}
