package org.example;
import java.util.Scanner;

// Vetores e Matrizes
// Atividade 2 - Temperatura em estufa

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[] temperatura = new double[10];
        int diasAcima30 = 0;

        System.out.println("==Registro de Temperatura da Estufa==");

        for (int i = 0; i < temperatura.length; i++) {
            System.out.print("Digite qual a temperatura do dia " + (i + 1) + " (°C): ");
            temperatura[i] = entrada.nextDouble();

            if (temperatura[i] > 30.0) {
                diasAcima30++;
            }
        }

        System.out.println("\n==Registro Final==");
        System.out.println("Total de dias com temperatura acima de 30°C: " + diasAcima30);

        entrada.close();
    }
}