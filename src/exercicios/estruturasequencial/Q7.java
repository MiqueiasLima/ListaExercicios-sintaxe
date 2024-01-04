package exercicios.estruturasequencial;

import java.util.Scanner;

/**
 * Faça um programa que leia um número real e imprima o resultado do quadrado desse número.
 */

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número real: ");
        float num = scanner.nextFloat();


        float quadrdado = num * num;

        System.out.println("O quadrado de "+num+ " é: "+quadrdado);
    }
}
