package exercicios;

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
