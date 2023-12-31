package exercicios;

/**
 * Crie um vetor de números inteiros e execute uma soma recursiva de cada elemento
 * presente em cada posição do vetor
 */

public class SomaVetorRecursivo {

    public static int somaElementosVector(int[] num, int soma, int pos){
        if(pos > num.length - 1){
            return soma;
        }else{
            return  soma + num[pos] + somaElementosVector(num, soma, pos+1);
        }
    }

    public static void main(String[] args) {

        int[] num = new int[]{1,2,3,4,5,6,7,8,9,10};
        int soma = 0;
        int pos = 0;

        int res = somaElementosVector(num,soma,pos);
        System.out.println(res);

    }
}
