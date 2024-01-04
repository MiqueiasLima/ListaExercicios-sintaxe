package exercicios.estruturasequencial;

import java.util.Scanner;

/**
 * Faça um programa que, a partir das medidas dos lados de um retângulo, lidos via teclado, calcule a
 * área e o perímetro deste retângulo.
 * A = a · b
 * P = 2 · a + 2 · b
 */

public class Q3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do lado L1: ");
        float a = scanner.nextFloat();

        System.out.println("Digite o valor do lado L2: ");
        float b = scanner.nextFloat();

        float area = a * b;
        float perimetro = (2 * a) + (2 * b);

        System.out.printf("O valor da Área é: %.2f \n",area);
        System.out.printf("O valor do perímetro é: %.2f", perimetro);

    }
}
