package org.example;
import java.util.Scanner;

//Lista de Exercicios sobre função
//Exercício 5: Função Calcular a Média de Três Notas

public class Main {
    public static double calcularM(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3.0;
    }
    public static void main(String[] args) {
        double n1 = 7.5;
        double n2 = 6.0;
        double n3= 9.0;

        double media = calcularM(n1, n2, n3);
        System.out.println("A média das notas é de: " + media);

    }
}