/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula34;

import java.util.Scanner;

/**
 *
 * @author Luan
 */
public class Ex {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
      int i = 0;
      int x = n;
        for ( i = n; i >=2; i--) {
            x = x * (i-1);
        }
        
        System.out.println(x);
    }
}
