package exercicios.estruturasequencial;

import java.util.Scanner;

/**
 *  Leia um valor inteiro positivo em segundos, e imprima-o em horas, minutos e segundos
 */

public class Q16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor em segundos(s): ");
        int valor = scanner.nextInt();

        int horas = valor / 3600;
        int segundos = valor % 3600;
        int minutos = segundos / 60;
        segundos = segundos % 60;

        System.out.println(""+horas+" Horas "+minutos+" minutos "+segundos+" segundos");
    }
}
