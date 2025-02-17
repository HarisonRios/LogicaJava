package school.sptech;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da base: ");
        int base = scanner.nextInt();

        System.out.print("Digite o valor do expoente: ");
        int expoente = scanner.nextInt();

        if (base <= 0 || expoente <= 0) {
            System.out.println("Erro: os valores da base e do expoente devem ser inteiros e positivos.");
            return;
        }

        int resultado = 1;

        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }

        System.out.println("O resultado da potência é: " + resultado);
    }
}