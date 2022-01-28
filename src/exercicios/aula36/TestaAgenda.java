/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula36;

/**
 *
 * @author Luan
 */
public class TestaAgenda {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Contato c1 = new Contato();
        Contato c2 = new Contato();
        Contato c3 = new Contato();
        
        agenda.setNome("agenda Pessoal");
        c1.setNome("Jorge");
        c1.setEmail("luan3642@hotmail.com");
        
        
        c2.setNome("luan");
        c2.setEmail("fake1245@hotmail.com");
        
        
        c3.setNome("Marcos");
        c3.setEmail("roberto5555");
        
        Contato[] contatos = new Contato[3];
        contatos[0] = c1;
        contatos[1] = c2;
        contatos[2] = c3;
        
        agenda.setContatos(contatos);
        
        for (Contato c : agenda.getContatos()) {
            System.out.println(c.getNome());
            System.out.println(c.getEmail());
        }
        
        
        
        
        
    }
}
