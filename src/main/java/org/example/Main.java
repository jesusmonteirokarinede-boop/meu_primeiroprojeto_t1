package org.example;

// Vetores e Matrizes - exemplos
// Matrizes: Exemplos de Tipos de Dados

public class Main {
    public static void main(String[] args) {
        int[][] matriz = new int[2][2]; //Cria uma matriz 2x2 de inteiros
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[1][0] = 3;
        matriz[1][1] = 4;
        System.out.println(matriz[1][0]);

        double[][] temperatura = new double[2][2]; //Cria uma matriz 2x2 de double
        temperatura[0][0] = 1.5;
        temperatura[0][1] = 2.65;
        temperatura[1][0] = 10.1;
        temperatura[1][1] = 7.7;
        System.out.println(temperatura[1][0]);

        char[][] letras = new char[2][2]; //Cria uma matriz 2x2 de char
        letras[0][0] = 'A';
        letras[0][1] = 'B';
        letras[1][0] = 'C';
        letras[1][1] = 'D';
        System.out.println(letras[0][0]);

        String[][] nomes = new String[2][2]; //Cria uma matriz 2x2 de String
        nomes[0][0] = "Joâo";
        nomes[0][1] = "Ana";
        nomes[1][0] = "Maria";
        nomes[1][1] = "Lucas";
        System.out.println(nomes[0][1]);

    }

}