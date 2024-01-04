package exercicios.estruturasequencial;

import java.util.Scanner;

/**
 * Faça a leitura de três valores e apresente como resultado a soma dos quadrados dos três valores e o
 * quadrado da soma dos três valores.
 */

public class Q11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        int somaDosQuadrados = (int) (Math.pow(num1, 2) + Math.pow(num2, 2) + Math.pow(num3, 2));
        int quadradoDaSoma = (int) (Math.pow(num1, 2) + Math.pow(num2, 2) + Math.pow(num3, 2) +
                (2 * num1 * num2) + (2 * num1 * num3) + (2 *
                num2 * num3));

        System.out.println("A soma dos quadrados é: "+somaDosQuadrados);
        System.out.println("O quadrado da soma é: "+quadradoDaSoma);
    }
}
