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
public class Livro {
    private String editora;
    private String idioma;
    private int paginas;
    private int isbn;
    private String nomeLivro;
    private boolean emprestado;
    private String nomeDaPessoaEmprestou;
    

    public String getEditora() {
        return editora;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public String getNomeDaPessoaEmprestou() {
        return nomeDaPessoaEmprestou;
    }

    public void setNomeDaPessoaEmprestou(String nomeDaPessoaEmprestou) {
        this.nomeDaPessoaEmprestou = nomeDaPessoaEmprestou;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    
    
    
    
}
