/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luan.cursojava.aula18;

/**
 *
 * @author luan3
 */
public class Goto {
    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) {
            rotulo1: {
                rotulo2: {
                    rotulo3: {
                        if (i == 1){
                            break rotulo1;
                        }
                        
                        if (i == 2){
                            break rotulo2;
                        }
                        
                        if (i == 3){
                            break rotulo3;
                        }
                        
                        System.out.println("Rótulo 3");
                    }
                    
                    System.out.println("Rótulo 2");
                }
                
                System.out.println("Rótulo 1");
            }
            System.out.println(i);
        }
    }
}
