
package exercicios.aula16;

import java.util.Scanner;


public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
              System.out.println("Entre com o seu nome");
        String nome = scan.nextLine();
        
        int i = 0;
        
        for (; i <nome.length(); i++) {
           
        }
        
        
        if(i >3){
            System.out.println("O nome possui mais que 3 caracteres, possui: "+i);
        } else{
            System.out.println("O nome não possui mais que 3 caractres, possui: "+i);
        }
        System.out.println("");
        
        System.out.println("Informe a sua idade");
        int idade = scan.nextInt();
        
        System.out.println("");
        if(idade > 0 && idade <=150){
            System.out.println("Idade entre 0 e 150");
        }else{
            System.out.println("A idade não está entre 0 e 150");
        }
        
        System.out.println("");
        
        System.out.println("Informe seu salário");
        double salario = scan.nextInt();
        
        if(salario >0){
            System.out.println("Seu salário é maior que 0");
        } else{
            System.out.println("O salário não é maior que 0");
        }

        System.out.println("Informe seu sexo");
        String sexo = scan.nextLine();
        
        if(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")){
            System.out.println("Sexo válido");
        } else{
            System.out.println("Sexo inválido");
        }  


        System.out.println("Informe seu estado cívil");
        String estadoCivil = scan.nextLine();
        
        if(estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")){
            System.out.println("Estado civíl válido");
        } else{
            System.out.println("Estado civíl inválido");
        }

    }
}
