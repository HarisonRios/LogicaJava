package school.sptech;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        double nota1;
        double nota2;

        System.out.println("Qual é o seu nome: ");
        nome = scanner.nextLine();

        System.out.println("Qual é sua primeira nota?");
        nota1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Qual é sua segunda nota?");
        nota2 = scanner.nextDouble();
        scanner.nextLine();

        double media = (nota1 + nota2) / 2;

        System.out.println("Olá, " + nome + " Sua média foi de " + media );

        scanner.close();


    }
}
