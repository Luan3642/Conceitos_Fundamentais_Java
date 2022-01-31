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
public class Aluno {
    
    private String nome;
    private String matricula;
    private int[] notas = new int[2];
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public int[] getNotas() {
        return notas;
    }
    
    public void setNotas(int[] notas) {
        this.notas = notas;
    }
    
    public void checarNotas() {
        int media[] = new int[5];
        int soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
            media[i] = soma / 2;
            
        }
        for (int i : media) {
            if (media[i] >= 7) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }            
        }
        
    }
    
}
