package exercicios;

/**
 * 	Imprima	a	seguinte	tabela	usando		for	s	encadeados:
 * 	1
 * 	2	4
 * 	3	6	9
 * 	4	8	12	16
 * 	n	n*2	n*3	....	n*n
 */

public class TrianguloDeFloyd {
    public static void main(String[] args) {

        int entrada = 5;

        for(int i = 1; i <= entrada; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
