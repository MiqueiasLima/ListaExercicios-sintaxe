package exercicios;

public class SomaUmAteMil {
    public static void main(String[] args) {

        int soma = 0;
        int somaLimit = 1000;

        for(int i = 1; i < somaLimit; i++){
            soma = soma + i;

        }
        System.out.println(soma);

    }
}
