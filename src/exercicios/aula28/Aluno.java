/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula28;

/**
 *
 * @author Luan
 */
public class Aluno {

    private String nome;
    private int matricula;
    private String cursoMatriculado;
    private String[] disciplinaMatriculado = new String[3];
    private int[] notaDisciplina = new int[3];

    public Aluno() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCursoMatriculado() {
        return cursoMatriculado;
    }

    public void setCursoMatriculado(String cursoMatriculado) {
        this.cursoMatriculado = cursoMatriculado;
    }

    public String[] getDisciplinaMatriculadonew() {
        return disciplinaMatriculado;
    }

    public void setDisciplinaMatriculadonew(String[] disciplinaMatriculado) {
        this.disciplinaMatriculado = disciplinaMatriculado;
    }

   

    public int[] getNotaDisciplina() {
        return notaDisciplina;
    }

    public void setNotaDisciplina(int[] notaDisciplina) {
        this.notaDisciplina = notaDisciplina;
    }

    public void aprovado(String[] disciplinas, int[] notas) {
        for (int i = 0; i < notaDisciplina.length; i++) {
            this.disciplinaMatriculado[i] = disciplinas[i];
            this.notaDisciplina[i] = notas[i];
            if (notas[i] >=7) {
                System.out.println("Aprovado em " + disciplinas[i]);
            } else {
                System.out.println("Reprovado em " + disciplinas[i]);
            }
        }
    }

}
