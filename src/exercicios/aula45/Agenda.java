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
public class Agenda {
    
     
    static Contato luan = new Contato();
    public void adicionarContato(String nome, String telefone){
        
        
        luan.setNome(nome);
        luan.setTelefone(telefone);
    }
    
    
    public Contato consultar(Contato contato){
        
        
        return contato;
    }
}
