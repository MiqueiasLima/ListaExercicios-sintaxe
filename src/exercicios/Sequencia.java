package exercicios;

/**
 * Escreva	um	programa	em	que,	dada	uma	variável		x		com	algum	valor	inteiro,	temos	um
 * novo		x		de	acordo	com	a	seguinte	regra:
 * Se		x		é	par,		x	=	x	/	2	;
 * Se		x		é	impar,		x	=	3	*	x	+	1	;
 * Imprime		x	;
 * 3.13	EXERCÍCIOS:	FIXAÇÃO	DE	SINTAXE 33
 * O	programa	deve	parar	quando		x		tiver	o	valor	final	de	1.	Por	exemplo,	para		x	=	13	,	a	saída
 * será:
 * 40	->	20	->	10	->	5	->	16	->	8	->	4	->	2	->	1
 */

public class Sequencia {
    public static void main(String[] args) {

        int entrada = 1;
        int aux = 0;

        while (aux != 1) {
            if (entrada % 2 == 0) {
                entrada = entrada / 2;
            } else {
                entrada = 3 * entrada + 1;
            }
            System.out.print(entrada + " ");
            aux = entrada;
        }
    }
}

