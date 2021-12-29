/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula20;

/**
 *
 * @author Luan
 */
public class Ex2 {

    public static void main(String[] args) {
        int m[][] = {{2, 2, 3, 596, 21, 42, 54, 14, 20}, {1, 4598, 4140, 20, 214, 258, 69}, {20222, 2, 2, 2, 5, 85, 8}, {21477, 2, 2, 2114, 236, 95}, {2, 2, 59, 8, 7, 487, 8, 5, 5, 89},
        {2, 2, 2, 25, 4, 47, 98, 877, 14}, {1, 1, 1, 5, 9, 6, 2, 21, 1}, {20, 10, 03, 05, 0200, 102, 200},
        {1000, 114, 11144, 58, 147, 69}, {2, 2, 5, 5, 5, 5, 9, 9, 99, 2}, {547, 10001, 1, 1, 5, 58, 47, 1596}};

        int maior5 = 0;
        int menor5 = Integer.MAX_VALUE;

        int maior7 = 0;
        int menor7 = Integer.MAX_VALUE;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " - ");
            }
            System.out.println("");
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] > maior5 && i == 5) {
                    maior5 = m[i][j];

                }
                if (m[i][j] < menor5 && i == 5) {
                    menor5 = m[i][j];
                }

                if (m[i][j] > maior7 && i == 7) {
                    maior7 = m[i][j];

                }
                if (m[i][j] < menor7 && i == 7) {
                    menor7 = m[i][j];
                }

            }
        }

        System.out.println("");
        System.out.println("Maior da linha 5: " + maior5);
        System.out.println("Menor da linha 5: " + menor5);

        System.out.println("");

        System.out.println("Maior da linha 7: " + maior7);
        System.out.println("Menor da linha 7: " + menor7);

    }
}
