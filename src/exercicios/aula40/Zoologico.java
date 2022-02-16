/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula40;

/**
 *
 * @author Luan
 */
public class Zoologico {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal2 = new Animal();
        
        
        animal.setNome("camelo");
        animal.setComprimento(150);
        animal.setNumeroPatas(4);
        animal.setCor("amarelo");
        animal.setAmbiente("Terra");
        animal.setVelocidade(2);
        
        Peixe peixe = new Peixe();
        peixe.setNome("Tubarão");
        peixe.setComprimento(300);
        peixe.setNumeroPatas(0);
        peixe.setCor("Cinzento");
        peixe.setAmbiente("mar");
        peixe.setVelocidade(1);
        peixe.setCaracteristicas("barbatana e cauda");
        
        Mamifero mamifero = new Mamifero();
        mamifero.setNome("Urso-do-canadá");
        mamifero.setComprimento(180);
        mamifero.setNumeroPatas(4);
        mamifero.setCor("vermelho");
        mamifero.setAmbiente("Terra");
        mamifero.setVelocidade(5);
        mamifero.setAlimento("Mel");
        
        System.out.println(animal);
        System.out.println(peixe);
        System.out.println(mamifero);
        
        
    }
}
