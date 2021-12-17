package exercicios.aula19;

import java.util.Scanner;

public class Ex24 {

   public static void main(String[] args) {
        int[] vetorA = {7,8,9,9,8,7};
        boolean palindromo = false;

        for (int i = 0; i < vetorA.length; i++) {
            for (int j = vetorA.length - 1; j >= 0; j--) {
                if (vetorA[i] == vetorA[j]) {
                    palindromo = true;
                } else {
                    palindromo = false;
                }

            }
        }
        if (palindromo == true) {
            System.out.println("O número é um palíndromo");
        } else{
            System.out.println("Não é palíndromo");
        }

    }

}
