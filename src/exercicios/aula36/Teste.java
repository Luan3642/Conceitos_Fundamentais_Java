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
public class Teste {

    public static void main(String[] args) {
        Contato contato = new Contato();
        Endereco end = new Endereco();
        
        
        
        contato.setNome("Luan");
        
        
        end.setNomeRua("rua gaspar");
        end.setNumero("444");
        end.setComplemento("-");
        end.setCidade("São Paulo");
        end.setEstado("Orlando");
        end.setCep("99999");
        
        
        Telefone telefone = new Telefone();
        telefone.setDdd("41");
        telefone.setNumero("99863-3431");
        telefone.setTipo("residencial");
        
        Telefone telefone2 = new Telefone();
        telefone2.setDdd("41");
        telefone2.setNumero("88888-8888");
        telefone2.setTipo("casa");
        
        
        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;
        
        contato.setTelefones(telefones);
        contato.setEndereco(end);
        System.out.println(contato.getNome());
        
        
        if(contato != null && contato.getEndereco() != null ){
            System.out.println(contato.getEndereco().getCidade());
        } 
        
        
        if(contato != null && contato.getTelefones() != null){
            for(Telefone t : contato.getTelefones()){
                System.out.println(t.getDdd() + " " + t.getNumero());
            }
        }
    }
}
