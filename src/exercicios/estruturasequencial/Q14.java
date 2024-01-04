package exercicios.estruturasequencial;

import java.util.Scanner;

/**
 *Faça um programa que leia um número inteiro positivo de três dígitos (de 100 a 999). Gere outro
 * número formado pelos dígitos invertidos do número lido. Exemplo:
 */

public class Q14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            System.out.println("Digite um número inteiro com três dígitos entre 100 e 999: ");
            int num = scanner.nextInt();

            int num1 = num % 10;
            int num2 = (num/10);
            int num3 = num2/10;
            num2 = num2 % 10;

            System.out.println(""+num1+""+num2+""+num3);
    }
}
