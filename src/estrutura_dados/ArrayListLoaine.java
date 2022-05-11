/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estrutura_dados;

import java.util.ArrayList;

public class ArrayListLoaine {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        
        arrayList.add("A");
        arrayList.add("C");
        arrayList.add(1, "B");
        
        System.out.println(arrayList);
        
        
        boolean existe = arrayList.contains("A");
        
        System.out.println(existe);
        
        
        int pos = arrayList.indexOf("B");
        
        System.out.println("Posição do B: "+pos);
        
        
        System.out.println(arrayList.get(pos));
        
        
        arrayList.remove(pos);
        
        System.out.println(arrayList);
        
        
        System.out.println(arrayList.size());
    }
}
