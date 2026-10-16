package org.example;
import java.util.Scanner;

//Lista de Exercicios sobre função
//Exercício 4: Função Converter Graus Celsius para Fahrenheit

public class Main {
    public static double converteCaF(double celsius) {
        return celsius * 1.8 + 32;
    }
    public static void main(String[] args) {
        double Tcelsius = 25.0;


        double Tfahrenheit = converteCaF(Tcelsius);
        System.out.println("°C é equivalente a " + Tfahrenheit + "°F.");

    }
}