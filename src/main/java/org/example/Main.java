package org.example;
import java.util.Scanner;

// Exercicios
// Questão 4 - Classificação de Desempenho
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota;
        System.out.println("Digite a nota: ");
        nota = entrada.nextDouble();


        if (nota >= 9){
            System.out.println("Muito bom!");
        } else if (nota >= 7) {
            System.out.println("Bom");
        } else if (nota >= 5) {
            System.out.println("Regular");
        } else {
            System.out.println("Irregular");
        }
    }
}