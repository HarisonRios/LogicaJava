package school.sptech.ex1;

public class TesteConfeitaria {

  public static void main(String[] args) {
    Bolo bolo = new Bolo();
    bolo.valor = 30.0;
    bolo.quantidadeEmEstoque = 10;
    bolo.quantidadeVendida = 0;

    bolo.venderBolo(5);
    bolo.quantidadeDisponivel();
    bolo.totalVendido();
    bolo.aumentarEstoque(10);
    bolo.quantidadeDisponivel();
    bolo.totalVendido();
  }
}
