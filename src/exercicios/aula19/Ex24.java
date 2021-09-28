package exercicios.aula19;

import java.util.Scanner;

public class Ex24 {

    static Scanner scan = new Scanner(System.in);

    public static Object avg(int n) {

        int setNumber[] = new int[n];
        int soma = 0;
        
        for (int i = 0; i < setNumber.length; i++) {
            System.out.println("Informe um número");
            setNumber[i] = scan.nextInt();
        }
        
        for (int i = 0; i <setNumber.length; i++) {
            soma += setNumber[i];
        }
        return "Média " +soma / n;
    }

    public static void main(String[] args) {
        System.out.println(avg(2));
    }

}
