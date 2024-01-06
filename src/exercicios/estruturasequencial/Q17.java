package exercicios.estruturasequencial;

import java.util.Scanner;

/**
 * Escreva um programa que leia as coordenadas x e y de pontos no R
 * 2
 * e calcule sua distância da origem
 * (0, 0).
 *
 */

public class Q17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da coordenada X: ");
        double coordenadaX = scanner.nextInt();

        System.out.println("Digite o valor da coordenada Y: ");
        double coordenadaY = scanner.nextInt();

        double distancia = Math.sqrt(Math.pow(coordenadaX,2) + Math.pow(coordenadaY,2));

        System.out.printf("Distância à origem: %.2f",distancia);
    }
}
