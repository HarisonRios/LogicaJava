package school.sptech;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    GerenciadorDeNotas gerenciador = new GerenciadorDeNotas();
    List<Double> notas = gerenciador.lerNotas();
    Double media = gerenciador.calcularMedia(notas);
    Boolean resultado = gerenciador.verificarResultado(media);
    gerenciador.calcularDiferenca(notas, media);
    Double mediaPonderada = gerenciador.calcularMediaPonderada(notas);
    System.out.println("Média: " + media);
    System.out.println("Resultado: " + resultado);
    System.out.println("Média ponderada: " + mediaPonderada);

  }
}