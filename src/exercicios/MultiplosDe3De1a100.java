package exercicios;

/**
 * Imprima	todos	os	múltiplos	de	3,	entre	1	e	100.
 */

public class MultiplosDe3De1a100 {
     public static void main(String[] args) {

        int numMax = 100;
        for (int i = 1; i <= numMax; i++) {
            if(i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}
