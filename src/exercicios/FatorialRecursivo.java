package exercicios;

public class FatorialRecursivo {

    private static long calculaFatorialRecursivo(int n){
        if(n == 0 || n == 1){
            return 1;
        }else{
            return n * calculaFatorialRecursivo(n - 1);
        }
    }


    public static void main(String[] args) {

        long res = calculaFatorialRecursivo(6);
        System.out.println(res);
    }
}
