package org.example;
import java.util.Scanner;

// Vetores e Matrizes
// Atividade 3 - Consumo de Água na Irrigação

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[] consumo = new double[12];

        double maior =0;
        int setor = 0;

        for (int i = 0; i < consumo.length; i++) {

            System.out.print("Informe o consumo de água do setor  " + (i + 1) + ", em litros: ");
            consumo[i] = entrada.nextDouble();


            if (i==0 || consumo[i] > maior) {
                maior = consumo[i];
                setor = i + 1;
            }
        }

        System.out.println("Setor com maior consumo de água: " + setor);
        System.out.println("Maior consumo: " + maior + " litros");
    }
}