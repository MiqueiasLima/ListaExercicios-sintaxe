package exercicios.estruturasequencial;

import java.util.Scanner;

/**
 * Faça um programa que leia a temperatura em graus Fahrenheit F e converta para graus Celsius C.
 * Fórmula: F = C ∗ (9.0/5.0) + 32.
 */

public class Q8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit(F): ");
        float fahrenheit = scanner.nextFloat();

        float celsius = (fahrenheit - 32) / (9.0f/5.0f);

        System.out.println("A temperatura em ºC é: "+celsius);

    }
}
