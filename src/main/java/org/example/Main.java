package org.example;
import java.util.Scanner;

//Lista de Exercicios sobre função
//Exercício 3: Função para calcular o dobro de um número

public class Main {
    public static int dobro(int numero) {
        return numero * 2;
    }
    public static void main(String[] args) {
        int numero1 = 9;


        int resultado = dobro(numero1);
        System.out.println("O dobro de " + numero1 + " é igual:" + resultado);

    }
}