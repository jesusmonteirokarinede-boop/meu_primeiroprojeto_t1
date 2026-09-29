//Estrtura de repetição
// Exercicio  1 - Controle de Entrada em Evento

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Informe o nome do participante " + i + ":");
            String nome = entrada.nextLine();

            System.out.println("Entrada registrada com sucesso: " + nome + " (Participante " + i + "/10)");
        }

        System.out.println("Todos os 10 participantes foram registrados!");
        entrada.close();
    }
}