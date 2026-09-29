package org.example;

import java.util.Scanner;

//Estrtura de repetição
// Exercício 4 - Pesquisa de Satisfação


public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota, qtdCliente = 1;

        while (qtdCliente < 10) {
            System.out.println("Cliente " + qtdCliente + " informe sua nota: ");
            nota = entrada.nextInt();
            qtdCliente++;
        }

        System.out.println("Quantidade de clientes participantes: " + qtdCliente);


    }
}