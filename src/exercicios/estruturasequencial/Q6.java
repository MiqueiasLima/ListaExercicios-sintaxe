package exercicios.estruturasequencial;

import java.util.Scanner;

/**
 *
 *  Elaborar um programa para calcular e imprimir o volume (V) de uma esfera e a área (A) de sua
 * superfície, dado o valor de seu raio (R). A fórmula do volume da esfera é V = 4/3 pi * r
 * A = 4 * pi * R²
 */

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do Raio da circunferência: ");
        float raio = scanner.nextFloat();

        float pi = 3.14f;

        float volume = 4.0f/3.0f * pi * raio;
        float area = 4 * pi * (raio * raio);

        System.out.println("O volume da circunferência é: "+volume);
        System.out.println("A área da circunferência é: "+area);

    }
}
