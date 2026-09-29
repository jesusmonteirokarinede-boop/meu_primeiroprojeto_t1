package org.example;
import java.util.Scanner;

// Exercicio estrutura de decisão
// Questão 2 -Aprovação do aluno
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota;
        System.out.println("Informe sua nota:");
        nota = entrada.nextDouble();

        if (nota >=7 ){
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}