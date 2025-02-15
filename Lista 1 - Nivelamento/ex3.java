package school.sptech;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cafe = 50.00;
        int quantidadeVendida;
        double valorPago;

        System.out.println("Quantidade vendida: ");
        quantidadeVendida = scanner.nextInt();

        System.out.println("Valor pago: ");
        valorPago = scanner.nextDouble();

        double troco = valorPago - cafe * quantidadeVendida;

        System.out.println("Seu troco será de R$ " + troco + " onde " + troco + " é o valor a ser devolvido ao cliente.\n");
        scanner.close();

    }
}
