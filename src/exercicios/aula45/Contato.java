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
public class Contato {
    private String nome;
    private String telefone;
    private int id;
    
    
    public Contato(){
        this.id += 1;
    }

    @Override
    public String toString() {
        return "Contato{" + "nome=" + nome + ", telefone=" + telefone + ", id=" + id + '}';
    }
    
    
}
