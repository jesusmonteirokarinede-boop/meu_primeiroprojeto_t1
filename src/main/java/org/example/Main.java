package org.example;
import java.util.Scanner;

// Vetores e Matrizes
// Atividade 1 - Produção de Milho por Semana

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[] prod = new double[7];

        double total = 0;
        double maior = 0;

        for (int i = 0; i < prod.length; i++) {

            System.out.print("Informe a produção da semana " + (i + 1) + ", em toneladas: ");
            prod[i] = entrada.nextDouble();

            total += prod[i];

            if (i == 0 || prod[i] > maior) {
                maior = prod[i];
            }
        }

        double media = total / prod.length;

        System.out.println("==RESULTADOS==");
        System.out.println("Produção total: " + total + " toneladas");
        System.out.println("Média semanal: " + media + " toneladas");
        System.out.println("Maior produção registrada: " + maior + " toneladas");
    }
}