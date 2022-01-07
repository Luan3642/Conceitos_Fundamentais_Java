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
public class LivroDeBiblioteca {
    public static void main(String[] args) {
        
        
        Livro livro = new Livro();
        
        livro.setNomeLivro("Código limpo");
        livro.setNomeDaPessoaEmprestou("Luan Magalhães");
        livro.setEmprestado(true);
        
        System.out.println("Nome livro: "+livro.getNomeLivro());
        System.out.println("Nome da pessoa que emprestou: "+livro.getNomeDaPessoaEmprestou());
        System.out.println("Está emprestado? "+livro.isEmprestado());
    }
}
