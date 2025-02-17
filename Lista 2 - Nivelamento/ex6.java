package school.sptech;
import java.util.Random;

public class ex6 {
    public static void main(String[] args) {
        int numeroEscolhido = new Random().nextInt(100) + 1;
        int[] sorteios = new int[200];
        int pares = 0;
        int impares = 0;
        int posicaoPrimeiroSorteio = -1;

        Random random = new Random();

        for (int i = 0; i < 200; i++) {
            sorteios[i] = random.nextInt(100) + 1;

            if (sorteios[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            if (sorteios[i] == numeroEscolhido && posicaoPrimeiroSorteio == -1) {
                posicaoPrimeiroSorteio = i + 1;
            }
        }

        System.out.println("O número escolhido foi: " + numeroEscolhido);
        System.out.println("O número foi sorteado pela 1ª vez na posição: " + posicaoPrimeiroSorteio);
        System.out.println("Quantidade de números pares sorteados: " + pares);
        System.out.println("Quantidade de números ímpares sorteados: " + impares);
    }
}