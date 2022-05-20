/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilhaTeste;

import java.util.Stack;

/**
 *
 * @author luan
 */
public class Aula18 {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        System.out.println(stack.isEmpty());

        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        System.out.println(stack.isEmpty());
        
        System.out.println(stack.size());
        
        System.out.println(stack);
        
        System.out.println(stack.peek());
        
        System.out.println(stack.pop());
        
        System.out.println(stack);
    }
}
