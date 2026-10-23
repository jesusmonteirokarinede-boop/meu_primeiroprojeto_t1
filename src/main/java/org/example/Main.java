package org.example;
import java.util.Scanner;

//Lista de Exercicios FUNÇÕES
//Exercício 6: Função para Verificar se um Número é Par

public class Main {
    public static boolean verificarPar(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Diga o valor: ");
        int num = entrada.nextInt();

        if (verificarPar(num)){
            System.out.println("True, " + num + " é Par!");
        } else {
            System.out.println("False, " + num + " é Impar!");
        }
    }
}