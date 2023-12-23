package exercicios;

/**
 * Imprima	os	fatoriais	de	1	a	n.
 */

public class FatorialDe1aN {
    public static void main(String[] args) {

        int entrada = 10;

        if (entrada == 0) {
            System.out.println("O fatorial de 0 é 1");
        } else {
            for (int i = 1; i <= entrada; i++) {
                long fatorial = 1;
                for (int j = 1; j <= i; j++) {
                    fatorial = fatorial * j;
                }
                System.out.println("O fatorial de " + i + " é " + fatorial);
            }
        }
    }
}
