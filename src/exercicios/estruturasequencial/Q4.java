package exercicios.estruturasequencial;

import java.util.Scanner;

/**
 *  Leia um número inteiro e imprima o seu antecessor e o seu sucessor.
 */

public class Q4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = scanner.nextInt();

        System.out.println("O sucessor de "+num+" é: "+ (num + 1));
        System.out.println("O antecessor de "+ num+ " é: "+(num -1));
    }
}
