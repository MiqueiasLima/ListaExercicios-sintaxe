package exercicios.estruturasequencial;

import java.util.Scanner;

/**
 * Leia o tamanho do lado de um quadrado e imprima como resultado a sua área.
 */

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número do lado: ");

        double lado = scanner.nextFloat();
        lado =  Math.pow(lado,2);

        System.out.println("A área do quadrado é: "+lado);
    }
}
