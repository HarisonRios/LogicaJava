package school.sptech;
import java.util.Scanner;

public class Exercicio1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Qual é o seu nome: ");
    String nome = scanner.nextLine();

    System.out.println("Quantas provas você realizou?");
    int qtdProvas = scanner.nextInt();

    double somaNotas = 0;

    for (int i = 1; i <= qtdProvas; i++) {
      System.out.println("Digite a nota da prova " + i + ": ");
      double nota = scanner.nextDouble();
      somaNotas += nota;
    }

    double media = somaNotas / qtdProvas;

    System.out.println("Aluno: " + nome);
    System.out.println("Média: " + media);

    scanner.close();
  }
}
