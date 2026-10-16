package org.example;
import java.util.Scanner;

// Vetores e Matrizes
// Atividade 8 - Controle de Praga

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[5][5];

        int maior = 0;
        int linhaM = 0;
        int colunaM = 0;

        System.out.println("Digite a quantidade de focos de pragas:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Região [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();

                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linhaM = i;
                    colunaM = j;
                }
            }
        }

        System.out.println("REGIÃO COM A MAIOR QUANTIDADE DE FOCO:");
        System.out.println("Linha: " + linhaM);
        System.out.println("Coluna: " + colunaM);
        System.out.println("Quantidade de focos: " + maior);


    }
}