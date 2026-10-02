package org.example;
import java.util.Scanner;

// Vetores e Matrizes
// Atividade 5 - Umidade do Solo

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] umidade = new double[8];
        int contador = 0;

        for (int i = 0; i < 8; i++) {
            System.out.print("Registro da umidade da água " + (i + 1) + " em porcentagem: ");
            umidade[i] = entrada.nextDouble();
        }

        for (int i = 0; i < 8; i++) {
            if (umidade[i] < 40) {
                contador++;
            }
        }

        System.out.println("Quantidade de áreas com umidade inferior a 40%: " + contador);
    }
}