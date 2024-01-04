package exercicios.estruturasequencial;

import java.util.Scanner;

/**
 *  Leia uma velocidade em km/h (quilômetros por hora) e apresente-a convertida em m/s (metros por
 * segundo). A fórmula de conversão é: M = K/3.6, sendo K a velocidade em km/h e M em m/s.
 */

public class Q9 {
    public static void main(String[] args) {

        System.out.println("Digite a velocidade em Km/h: ");
        Scanner scanner = new Scanner(System.in);
        float numKlmH = scanner.nextFloat();
        float velMetrosPSeg = numKlmH/3.60f;


        System.out.println("A velocidade de "+numKlmH+ " km/h convertida é de: "+velMetrosPSeg+" m/s");
    }
}
