package school.sptech;
import java.util.Random;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Integer numeroEscolhido = -1;
        while (numeroEscolhido < 0 || numeroEscolhido > 100) {
            System.out.println("Escolha um número entre 0 e 100: ");
            numeroEscolhido = scanner.nextInt();

            if (numeroEscolhido < 0 || numeroEscolhido > 100) {
                System.out.println("Número inválido. Digite um número entre 0 e 100.");
            }
        }

        int numeroArmazenado = -1;

        for (int i = 0; i < 200; i++) {
            int numeroSorteado = random.nextInt(101);

            if (numeroSorteado == numeroEscolhido && numeroArmazenado == -1) {
                numeroArmazenado = i + 1;
            }
        }

        if (numeroArmazenado != -1) {
            if (numeroArmazenado < 10) {
                System.out.println("Você é MUITO sortudo");
            } else if (numeroArmazenado >= 10 && numeroArmazenado <= 50) {
                System.out.println("Você é sortudo");
            } else {
                System.out.println("Melhor parar de apostar e ir trabalhar!");
            }
        } else {
            System.out.println("O número escolhido não foi sorteado em 200 tentativas.");
        }

        scanner.close();
    }
}




