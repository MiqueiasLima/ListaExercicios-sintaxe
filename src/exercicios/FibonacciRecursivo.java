package exercicios;

public class FibonacciRecursivo {

    static int calculaFibonacciRecursivo(int num){
        if(num <= 1){
            return 1;
        }else{
         return calculaFibonacciRecursivo(num - 1) +
                 calculaFibonacciRecursivo(num - 2);
        }
    }

    public static void main(String[] args) {
        int num = 3;
        for(int i = 0; i < num; i++){
            System.out.print(calculaFibonacciRecursivo(i) + " ");
        }
    }
}
