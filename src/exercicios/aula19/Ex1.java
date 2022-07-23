package exercicios.aula19;

import java.util.Scanner;
public class Ex1{
    public static void main(String[] args){
        
        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];
        
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i <vetorA.length; i++) {
            System.out.println("Informe o valor do vetor A");
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i];
        }
        
        for(int c: vetorA){
            System.out.println("Vetor A");
            System.out.println(c);
        }
        System.out.println("");
        for(int v: vetorB){
            System.out.println("Vetor B ");
            System.out.println(v);
        }
        
        
        
    }
}