package exercicios;

/**
 * 	 Imprima	 os	 primeiros	 números	 da	 série	 de	 Fibonacci	 até	 passar	 de	 100.	 A	 série	 de
 * Fibonacci	é	a	seguinte:	0,	1,	1,	2,	3,	5,	8,	13,	21,	etc.	Para	calculá-la,	o	primeiro	elemento	vale	0,	o
 * segundo	vale	1,	e	daí	por	diante.	O	n-ésimo	elemento	vale	o	(n-1)-ésimo	elemento	somado	ao	(n-2)-
 * ésimo	elemento	(ex:	8	=	5	+	3).
 */

public class Fibonacci {
    public static void main(String... args) {

        int num1 = 0;
        int num2 = 0;
        int resultado;
        int entrada = 10;

        if (entrada != 0) {
            for (int i = 0; i < entrada; i++) {
                if (i == 1) {
                    num2 = 1;
                    resultado = num1 + num2;
                } else {
                    resultado = num1 + num2;
                    num1 = num2;
                    num2 = resultado;
                }
                System.out.print(resultado + " ");
            }
        }
    }
}
