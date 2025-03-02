package school.sptech;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorDeNotas {

    public List<Double> lerNotas(){
        List<Double> notas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de notas: ");
        int quantidade = scanner.nextInt();
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite a nota " + (i + 1) + ": ");
            notas.add(scanner.nextDouble());
        }
        return notas;
    }

public Double calcularMedia(List<Double> notas){
        if (notas == null || notas.isEmpty()) {
            return null;
        }
        Double soma = 0.0;
        for (Double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }

    public Boolean verificarResultado(Double media) {
        if (media == null || media < 0.0 || media > 10.0) {
            return null;
        }
        return media >= 7.0;
    }

    public void calcularDiferenca(List<Double> notas, Double media){
        if (notas == null || notas.isEmpty() || media == null) {
            return;
        }
        for (Double nota : notas) {
            System.out.println("Diferença entre a nota " + nota + " e a média: " + (nota - media));
        }
    }

    Double calcularMediaPonderada(List<Double> notas){
        if (notas == null || notas.isEmpty()) {
            return null;
        }
        Double soma = 0.0;
        Double somaPesos = 0.0;
        Scanner scanner = new Scanner(System.in);
        for (Double nota : notas) {
            System.out.println("Digite o peso da nota " + nota + ": ");
            Double peso = scanner.nextDouble();
            soma += nota * peso;
            somaPesos += peso;
        }
        return soma / somaPesos;
    }
}
