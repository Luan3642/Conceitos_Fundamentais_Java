/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luan.cursojava.aula43;

import java.util.Arrays;
import java.util.Objects;




/**
 *
 * @author Luan
 */
public class Aluno {

    private String curso;
    private double[] notas;

    public Aluno(String nome, String endereco, String telefone, String curso) {
//        super(nome, endereco, telefone);
        this.curso = curso;
    }

    public void verificarAcesso() {

    }

    public Aluno() {
        super();
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        return 0;
    }

    public boolean verificarAprovado() {
        return true;
    }

    public void metodoQualquer() {
//        super.setCpf("454455454");
    }

    public String obterEtiquetaEndereco() {
        String s = "endereço do aluno: ";
//        s += super.getEndereco();
        
        return s;
    }

//    @Override
    public void imprimirEtiquetaEndereco() {
        System.out.println(this.obterEtiquetaEndereco());
    }

    public String toString() {
        String s = curso + "\n";
        for(double n : notas){
            s+= n + " ";
        }
        return s;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
  
        final Aluno other = (Aluno) obj;
       
        if(curso.equalsIgnoreCase(other.getCurso())){
            return true;
        }
        
        
        return true;
    }
    
    
    
    

}
