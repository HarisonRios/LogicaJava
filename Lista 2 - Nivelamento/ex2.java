package school.sptech;
import java.util.Random;


public class ex2 {
    public static void main(String[] args) {
        int soma = 0;
        Random random = new Random();

        while (true) {
            int numeroSorteado = random.nextInt(11);
            soma += numeroSorteado;

            if (numeroSorteado == 0) {
                break;
            }
        }

        System.out.println("A soma dos números é " + soma);
    }
}
