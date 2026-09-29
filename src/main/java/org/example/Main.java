package org.example;
import java.util.Scanner;

// Exercicios de estrutura de decisão
// Exercício 6 - Direito ao Vale Refeição
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu salário: ");
        double salario = entrada.nextDouble();

        if (salario <= 4000) {
            System.out.println("Você possui direito ao VR.");
        } else {
            System.out.println("Você não possui direito ao VR.");
        }
    }
}