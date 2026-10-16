package org.example;
import java.util.Scanner;

//Lista de Exercicios sobre função
//Exercício 2: Função que soma dois números

public class Main {
    public static int soma(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 15;

        int resultado = soma(num1, num2);
        System.out.println("A soma entre os dois números é de: " + resultado);

    }
}