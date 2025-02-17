package school.sptech;

import java.util.Random;

public class ex8 {
    public static void main(String[] args) {
        int votosMussarela = 0;
        int votosCalabresa = 0;
        int votosQuatroQueijos = 0;
        int voto;
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            voto = random.nextInt(3) + 1;

            if (voto == 1) {
                votosMussarela++;
            } else if (voto == 2) {
                votosCalabresa++;
            } else {
                votosQuatroQueijos++;
            }
        }

        System.out.println("Votos por sabor:");
        System.out.println("Mussarela: " + votosMussarela);
        System.out.println("Calabresa: " + votosCalabresa);
        System.out.println("Quatro queijos: " + votosQuatroQueijos);

        if (votosMussarela > votosCalabresa && votosMussarela > votosQuatroQueijos) {
            System.out.println("O sabor favorito é mussarela.");
        } else if (votosCalabresa > votosMussarela && votosCalabresa > votosQuatroQueijos) {
            System.out.println("O sabor favorito é calabresa.");
        } else {
            System.out.println("O sabor favorito é quatro queijos.");
        }
    }
}
