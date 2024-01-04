package exercicios.estruturasequencial;

import java.util.Scanner;

/**
 *  Faça um programa que receba um valor em R$ que será dividida entre três ganhadores de um
 * concurso. Sendo que da quantia total:
 * • O primeiro ganhador receberá 46%;
 * • O segundo ganhador receberá 32%;
 * • O terceiro receberá o restante;
 * Calcule e imprima a quantia ganha por cada um dos ganhadores.
 */


public class Q13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do prêmio: ");
        double premio = scanner.nextDouble();

        double ganhador1;
        double ganhador2;
        double ganhador3;

        ganhador1 = premio * 0.46;
        ganhador2 = premio * 0.32;
        ganhador3 = Math.ceil(premio * (1 - (0.46 + 0.32)));

        System.out.println("Ganhador 1: R$ "+ganhador1);
        System.out.println("Ganhador 2: R$ "+ganhador2);
        System.out.println("Ganhador 3: R$ "+ganhador3);

    }
}
