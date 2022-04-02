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
    private int id = 0;
    private String email;
    private static int contador = 0;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public Contato(){
        contador++;
        id = contador;
    }

    @Override
    public String toString(){
        String s = "[";
         s += "ID: " +id;
         s += ",  Nome: " +nome ;
         s += ", telefone: " +telefone ;
         s += ", Email: " +email ;
         s += " ]";
         
         return s;
         
    }
    
    
}
