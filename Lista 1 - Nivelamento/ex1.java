package school.sptech;

import java.util.Scanner;

public class ex1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int filho0a4;
    int filho4a16;
    int filho17a18;

    double valor_0a3 = 25.12;
    double valor_4a16 = 195.88;
    double valor_17a18 = 12.44;

    System.out.print("Quantos filhos de 0 a 3 anos possui: ");
    filho0a4 = scanner.nextInt();

    System.out.print("Quantos filhos de 4 a 16 anos possui: ");
    filho4a16 = scanner.nextInt();

    System.out.print("Quantos filhos de 17 a 18 anos possui: ");
    filho17a18 = scanner.nextInt();

    double totalBolsa0a3 = filho0a4 * valor_0a3;
    double totalBolsa4a16 = filho4a16 * valor_4a16;
    double totalBolsa17a18 = filho17a18 * valor_17a18;

    if (filho0a4 < 3) {
      System.out.println("Você tem um total de " + filho0a4 + " filhos e vai receber " + totalBolsa0a3 + " de bolsa.");
    } else if (filho4a16 > 4 && filho4a16 < 16) {
      System.out.println("Voce tem um total de " + filho4a16 + " filhos e vai receber " + totalBolsa4a16 + " de bolsa.");
    } else if (filho17a18 >= 17) {
      System.out.println("Voce tem um total de  " + filho17a18 + " filhos e vai receber "  + totalBolsa17a18 + " de bolsa.");
    }
    scanner.close();

  }
}
