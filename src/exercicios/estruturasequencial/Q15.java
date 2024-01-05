package exercicios.estruturasequencial;

import java.util.Scanner;

/**
 * Leia um número inteiro de 4 dígitos (de 1000 a 9999) e imprima 1 dígito por linha.
 */

public class Q15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro de 4 dígitos entre 1000 e 9999: ");
        int num = scanner.nextInt();

        int num1 = num % 10;
        int num2 = num / 10;
        int num3 = num2 % 10;
        num2 = num2 / 10;
        int num4 = num2 % 10;
        num2 = num2 / 10;

        System.out.printf("%d\n%d\n%d\n%d\n",num2,num4,num3,num1);

    }
}
