package org.example;
import java.util.Scanner;

// Exercicios de estrutura de decisão
// Exercício 9 - Auxilio para Curso de idiomas
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o cargo do funcionário:");
        String cargo = entrada.nextLine();
        if (cargo.equalsIgnoreCase("administrativo") || cargo.equalsIgnoreCase("liderança") || cargo.equalsIgnoreCase("lideranca")) {
            System.out.println("Você pode participar do programa de idiomas.");
        } else {
            System.out.println("Você não tem acesso ao programa de idiomas no momento.");
        }
    }
}