package org.example;

import java.util.Scanner;

//Estrtura de repetição
// Exercício 5 - Caixa de Supermercado


public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valor, soma;
        String continuar;

        soma = 0;
        do {
            System.out.println("Digite o valor do produto: ");
            valor = entrada.nextDouble();
            soma = soma + valor;
            System.out.println("Continuar? (y)");

            entrada.nextLine(); // limpa o buffer
            continuar = entrada.nextLine();
        } while (continuar.equals("y") || continuar.equals("Y"));

        System.out.println("Total da compra: " + soma );

    }


}