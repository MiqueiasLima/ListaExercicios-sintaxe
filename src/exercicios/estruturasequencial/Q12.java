package exercicios.estruturasequencial;

import java.util.Scanner;

/**
 *  Faça um programa que receba o salário de um funcionário. Calcule e imprima o valor do novo salário,
 * sabendo que ele recebeu um aumento de 21, 37%.
 */

public class Q12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do salário: ");
        double salario = scanner.nextDouble();

        double aumento = salario * 0.2137;
        salario = salario + aumento;

        System.out.println("Aumento: R$ "+aumento);
        System.out.println("Salário Total: R$ "+salario);
    }
}
