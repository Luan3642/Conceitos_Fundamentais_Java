/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula27;

/**
 *
 * @author Luan
 */
public class Aluno {

    public String nome;
    public String matricula;
    public String curso;
    public String[] disciplinas = new String[3];
    public int[] notas = new int[3];

    public void aprovado(int[] notasFornecidas, String[] disciplinaFornecida) {
        int soma = 0, media = 0;
        for (int i = 0; i < notas.length; i++) {
            this.notas[i] = notasFornecidas[i];
            this.disciplinas[i] = disciplinaFornecida[i];
            

            if (notas[i] >=7) {
                System.out.println("Aprovado em " + disciplinaFornecida[i] + " nota: "+notas[i]);
            } else {
                System.out.println("reprovado em " + disciplinaFornecida[i] + " nota: "+notas[i]);

            }
        }

        

    }

}
