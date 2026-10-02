package org.example;
import java.util.Scanner;

// Vetores e Matrizes
// Atividade 4 - Produção de Hortaliças por Talhão

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] prod = new double[5];
        double total = 0;

        for (int i = 0; i < prod.length; i++) {

            System.out.print("Informe a produção de Hortaliças por talhão " + (i + 1) + ", em kg: ");
            prod[i] = entrada.nextDouble();

            total += prod[i];
        }

        System.out.println("===PRODUÇÃO POR TALHÃO=== ");

        for (int i = 0; i < prod.length; i++) {
            System.out.println("Talhão " + (i + 1) + ": " + prod[i] + " kg");
        }

        System.out.println("TOTAL GERAL PRODUZIDOS: " + total + " kg");
    }
}