// EXERCÍCIO 3: ENTRADA DE DADOS

import java.util.Scanner;

public class Cumprimento {

    public static void main(String[] args) {

        // Criação do Scanner
        Scanner scanner = new Scanner(System.in);

        // Pergunta ao usuário
        System.out.print("Digite seu nome: ");

        // Leitura do nome
        String nome = scanner.nextLine();

        // Mensagem de cumprimento
        System.out.println("Olá, " + nome + "! Bem-vindo ao Java!");

        // Fechar o Scanner
        scanner.close();
    }

}
