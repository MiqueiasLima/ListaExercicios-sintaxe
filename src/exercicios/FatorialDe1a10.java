package exercicios;

public class FatorialDe1a10 {
    public static void main(String[] args) {

        int entrada = 20;

        for(int i = 1; i <= entrada; i++){
            long fatorial = 1;
            for(int j = 1; j <= i; j++){
                fatorial = fatorial * j;
            }
            System.out.println("O fatorial de "+i+ " é "+fatorial);
        }
    }
}
