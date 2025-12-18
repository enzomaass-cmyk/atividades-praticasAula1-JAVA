// EXERCÍCIO 5: CONVERSOR DE TEMPERATURA

import java.util.Scanner;

public class ConversorTemp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Leitura da temperatura em Celsius
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        // Conversão para Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Exibição do resultado formatado
        System.out.printf("%.1f°C = %.1f°F%n", celsius, fahrenheit);

        scanner.close();
    }

}
