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
    private double[] notas = new double[4];

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

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
    public void obterMedia(){
        double soma = 0;
        
        for (double nota : notas) {
            soma += nota;
        }
        
        double media = soma / 4;
        
        if(media >=7){
            System.out.println("Aprovado");
        } else{
            System.out.println("Reprovado");
        }
        
    }

}
