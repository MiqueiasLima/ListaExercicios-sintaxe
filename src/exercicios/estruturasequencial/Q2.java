package exercicios.estruturasequencial;

import java.util.Scanner;

/**
 * Crie um programa que permita fazer a conversão cambial entre Dólares e Reais. Considere como
 * taxa de câmbio US$ 1,0 = R$3,07. Leia um valor em Dólares pelo teclado e mostre o correspondente
 * em Reais
 */

public class Q2 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Digite o valor em dólares: ");
        double dolares = scanner.nextDouble();
        dolares = dolares * 3.07;

        System.out.printf("O valor em reais é R$ %.2f: ",dolares);

    }
}
