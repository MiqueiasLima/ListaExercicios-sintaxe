package exercicios.estruturasequencial;

import java.util.Scanner;

/**
 *  Leia um ângulo em graus e apresente-o convertido em radianos. A fórmula de conversão é: R =
 * G ∗ π/180, sengo G o ângulo em graus e R em radianos. Use π = 3.14.
 */

public class Q10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor em Graus: ");
        float graus = scanner.nextFloat();

        float rad = (3.14f * graus) / 180;

        System.out.println("O valor em Radianos é: "+rad);
    }
}
