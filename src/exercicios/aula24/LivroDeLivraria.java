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
public class LivroDeLivraria {
    public static void main(String[] args) {
        
        Livro livro = new Livro();
        
        livro.setEditora("Alta Books");
        livro.setIdioma("português");
        livro.setIsbn(85760826);
        livro.setPaginas(425);
        
        System.out.println("Editora: "+livro.getEditora());
        System.out.println("Idioma: "+livro.getIdioma());
        System.out.println("ISBN: "+livro.getIsbn());
        System.out.println("Páginas: "+livro.getPaginas());
    }
}
