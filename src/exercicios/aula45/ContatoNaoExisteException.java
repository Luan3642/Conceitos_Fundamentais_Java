/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.aula45;

/**
 *
 * @author luan
 */
public class ContatoNaoExisteException extends Exception {
    private String nomeContato;
    
    public ContatoNaoExisteException(String nomeContato){
        this.nomeContato = nomeContato;
    }

    @Override
    public String getMessage() {
        return "Contato " +nomeContato + " não existe na agenda";
    }
    
    
    
}
