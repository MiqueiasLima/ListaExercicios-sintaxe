package exercicios;

/**
 *  Imprima	a	soma	de	1	até	1000.
 */

public class SomaUmAteMil {
    public static void main(String[] args) {

        int soma = 0;
        int somaLimite = 1000;

        for(int i = 1; i < somaLimite; i++){
            soma = soma + i;
        }
        System.out.println(soma);
    }
}
