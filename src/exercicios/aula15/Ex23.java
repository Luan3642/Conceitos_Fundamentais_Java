package exercicios.aula15;

import java.util.Scanner;

public class Ex23 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe qual carne deseja");

        System.out.println("1- Filé Duplo ");
        System.out.println("2- Alcatra ");
        System.out.println("3- Picanha");
        int escolhaCarne = scan.nextInt();

        System.out.println("");

        switch (escolhaCarne) {
            case 1:

                System.out.println("A compra será feita no cartão de crédito Tabajará?");
                boolean cartaoEscolha = scan.nextBoolean();

                System.out.println("Informe a quantidade que deseja comprar de Filé Duplo");
                int quilosFileDuplo = scan.nextInt();

                if (cartaoEscolha) {
                    if (quilosFileDuplo <= 5) {
                        double quantidadePagarSemDesconto = quilosFileDuplo * 4.90;

                        double desconto = quantidadePagarSemDesconto / (100 / 5);
                        double totalPagar = quantidadePagarSemDesconto - desconto;

                        System.out.println("Você está comprando Filé Duplo");
                        System.out.println("A quantidade de carne que está comprando é igual a: " + quilosFileDuplo);
                        System.out.println("O preço total é: " + quantidadePagarSemDesconto);
                        System.out.println("Cartão tabajará? " + cartaoEscolha);
                        System.out.println("Desconto de 5% " + desconto);
                        System.out.println("Total a pagar: " + totalPagar);

                    } else {
                        double quantidadePagarSemDesconto = quilosFileDuplo * 5.80;

                        double desconto = quantidadePagarSemDesconto / (100 / 5);
                        double totalPagar = quantidadePagarSemDesconto - desconto;

                        System.out.println("Você está comprando Filé Duplo");
                        System.out.println("A quantidade de carne que está comprando é igual a: " + quilosFileDuplo + "KG quilos");
                        System.out.println("O preço total é: " + quantidadePagarSemDesconto);
                        System.out.println("Cartão tabajará? " + cartaoEscolha);
                        System.out.println("Desconto de 5% " + desconto);
                        System.out.println("Total a pagar: " + totalPagar);
                    }
                } else {
                    if (quilosFileDuplo <= 5) {
                        double quantidadePagarSemDesconto = quilosFileDuplo * 4.90;

                        double totalPagar = quantidadePagarSemDesconto;

                        System.out.println("Você está comprando Filé Duplo");
                        System.out.println("A quantidade de carne que está comprando é igual a: " + quilosFileDuplo + " KG quilos ");
                        System.out.println("Cartão tabajará? " + cartaoEscolha);
                        System.out.println("Total a pagar: " + totalPagar);

                    } else {
                        double quantidadePagarSemDesconto = quilosFileDuplo * 5.80;

                        double totalPagar = quantidadePagarSemDesconto;

                        System.out.println("Você está comprando Filé Duplo");
                        System.out.println("A quantidade de carne que está comprando é igual a: " + quilosFileDuplo + " KG quilos ");

                        System.out.println("Cartão tabajará? " + cartaoEscolha);
                        System.out.println("Total a pagar: " + totalPagar);

                    }
                }
                break;

            case 2:
                System.out.println("A compra será feita no cartão de crédito Tabajará?");
                cartaoEscolha = scan.nextBoolean();

                System.out.println("Informe a quantidade que deseja comprar de Alcatra que deseja");
                int quilosAlcatra = scan.nextInt();

                if (cartaoEscolha) {
                    if (quilosAlcatra <= 5) {
                        double quantidadePagarSemDesconto = quilosAlcatra * 5.90;

                        double desconto = quantidadePagarSemDesconto / (100 / 5);
                        double totalPagar = quantidadePagarSemDesconto - desconto;

                        System.out.println("Você está comprando Alcatra");
                        System.out.println("A quantidade de carne que está comprando é igual a: " + quilosAlcatra);
                        System.out.println("O preço total é: " + quantidadePagarSemDesconto);
                        System.out.println("Cartão tabajará? " + cartaoEscolha);
                        System.out.println("Desconto de 5% " + desconto);
                        System.out.println("Total a pagar: " + totalPagar);

                    } else {
                        double quantidadePagarSemDesconto = quilosAlcatra * 6.80;

                        double desconto = quantidadePagarSemDesconto / (100 / 5);
                        double totalPagar = quantidadePagarSemDesconto - desconto;

                        System.out.println("Você está comprando Filé Duplo");
                        System.out.println("A quantidade de carne que está comprando é igual a: " + quilosAlcatra + "KG quilos");
                        System.out.println("O preço total é: " + quantidadePagarSemDesconto);
                        System.out.println("Cartão tabajará? " + cartaoEscolha);
                        System.out.println("Desconto de 5% " + desconto);
                        System.out.println("Total a pagar: " + totalPagar);
                    }
                } else {
                    if (quilosAlcatra <= 5) {
                        double quantidadePagarSemDesconto = quilosAlcatra * 5.90;

                        double totalPagar = quantidadePagarSemDesconto;

                        System.out.println("Você está comprando Filé Duplo");
                        System.out.println("A quantidade de carne que está comprando é igual a: " + quilosAlcatra + " KG quilos ");
                        System.out.println("Cartão tabajará? " + cartaoEscolha);
                        System.out.println("Total a pagar: " + totalPagar);

                    } else {
                        double quantidadePagarSemDesconto = quilosAlcatra * 6.80;

                        double totalPagar = quantidadePagarSemDesconto;

                        System.out.println("Você está comprando Filé Duplo");
                        System.out.println("A quantidade de carne que está comprando é igual a: " + quilosAlcatra + " KG quilos ");

                        System.out.println("Cartão tabajará? " + cartaoEscolha);
                        System.out.println("Total a pagar: " + totalPagar);

                    }
                }
                
                break;
                
            case 3:
                
                
                System.out.println("A compra será feita no cartão de crédito Tabajará?");
                cartaoEscolha = scan.nextBoolean();

                System.out.println("Informe a quantidade que deseja comprar de Picanha que deseja");
                int quilosPicanha = scan.nextInt();

                if (cartaoEscolha) {
                    if (quilosPicanha <= 5) {
                        double quantidadePagarSemDesconto = quilosPicanha * 6.90;

                        double desconto = quantidadePagarSemDesconto / (100 / 5);
                        double totalPagar = quantidadePagarSemDesconto - desconto;

                        System.out.println("Você está comprando Alcatra");
                        System.out.println("A quantidade de carne que está comprando é igual a: " + quilosPicanha);
                        System.out.println("O preço total é: " + quantidadePagarSemDesconto);
                        System.out.println("Cartão tabajará? " + cartaoEscolha);
                        System.out.println("Desconto de 5% " + desconto);
                        System.out.println("Total a pagar: " + totalPagar);

                    } else {
                        double quantidadePagarSemDesconto = quilosPicanha * 7.80;

                        double desconto = quantidadePagarSemDesconto / (100 / 5);
                        double totalPagar = quantidadePagarSemDesconto - desconto;

                        System.out.println("Você está comprando Filé Duplo");
                        System.out.println("A quantidade de carne que está comprando é igual a: " + quilosPicanha + "KG quilos");
                        System.out.println("O preço total é: " + quantidadePagarSemDesconto);
                        System.out.println("Cartão tabajará? " + cartaoEscolha);
                        System.out.println("Desconto de 5% " + desconto);
                        System.out.println("Total a pagar: " + totalPagar);
                    }
                } else {
                    if (quilosPicanha <= 5) {
                        double quantidadePagarSemDesconto = quilosPicanha * 6.90;

                        double totalPagar = quantidadePagarSemDesconto;

                        System.out.println("Você está comprando Filé Duplo");
                        System.out.println("A quantidade de carne que está comprando é igual a: " + quilosPicanha + " KG quilos ");
                        System.out.println("Cartão tabajará? " + cartaoEscolha);
                        System.out.println("Total a pagar: " + totalPagar);

                    } else {
                        double quantidadePagarSemDesconto = quilosPicanha * 7.80;

                        double totalPagar = quantidadePagarSemDesconto;

                        System.out.println("Você está comprando Filé Duplo");
                        System.out.println("A quantidade de carne que está comprando é igual a: " + quilosPicanha + " KG quilos ");

                        System.out.println("Cartão tabajará? " + cartaoEscolha);
                        System.out.println("Total a pagar: " + totalPagar);

                    }
                }
                
                break;
        }

    }
}
