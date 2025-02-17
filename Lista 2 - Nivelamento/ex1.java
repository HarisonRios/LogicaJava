package school.sptech;

import java.util.Random;
import java.util.Scanner;

public class ex1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Escolha um número entre 0 e 10: ");
    int numeroEscolhido = scanner.nextInt();

    Random random = new Random();
    int tentativas = 0;

    while (true) {
      int numeroSorteado = random.nextInt(11);
      tentativas++;

      System.out.println("Tentativa " + tentativas + ": " + numeroSorteado);

      if (numeroSorteado == numeroEscolhido) {
        break;
      }
    }

    if (tentativas <= 3) {
      System.out.println("Você é MUITO sortudo");
    } else if (tentativas >= 4 && tentativas <= 10) {
      System.out.println("Você é sortudo");
    } else {
      System.out.println("É melhor você parar de apostar e ir trabalhar");
    }

  }
}