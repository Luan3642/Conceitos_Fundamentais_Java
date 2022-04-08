/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrutura_dados;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luan
 */
public class TestaVetor {

    public static void main(String[] args) {
        Vetor vetor = new Vetor(2);

        try {
            vetor.adiciona("elemento 1");
            vetor.adiciona("elemento 2");
            vetor.adiciona("elemento 3");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
