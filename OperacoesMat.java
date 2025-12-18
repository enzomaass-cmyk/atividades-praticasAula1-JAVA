// EXERCÍCIO 4: OPERAÇÕES MATEMÁTICAS

import java.util.Scanner;

public class OperacoesMat {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Leitura dos números
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        // Cálculos
        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        int divisao = num1 / num2; // divisão inteira
        int resto = num1 % num2;

        // Exibição dos resultados
        System.out.println();
        System.out.println("=== RESULTADOS ===");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Resto: " + resto);

        scanner.close();
    }

}
