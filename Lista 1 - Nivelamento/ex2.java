package school.sptech;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tempoAquecimento;
        int tempoAerobico;
        int tempoMusculacao ;

        double aquecimento = 12;
        double aerobico = 20;
        double musculacao = 25;


        System.out.println("Digite o tempo de aquecimento em minutos: ");
        tempoAquecimento = scanner.nextInt();

        System.out.println("Digite o tempo de exercício aerobico em minutos: ");
        tempoAerobico = scanner.nextInt();

        System.out.println("Digite o tempo de exercício musculacao em minutos: ");
        tempoMusculacao = scanner.nextInt();


        double totalExercicios = tempoAquecimento + tempoAerobico + tempoMusculacao;
        double totalCalorias = (tempoAquecimento * aquecimento) + (tempoAerobico * aerobico) + (tempoMusculacao * musculacao);


        System.out.println("Olá, Jorge. Você fez um total de " + totalExercicios + " minutos de exercícios e perdeu cerca de " + totalCalorias + " calorias.\n");


        scanner.close();

    }
}
