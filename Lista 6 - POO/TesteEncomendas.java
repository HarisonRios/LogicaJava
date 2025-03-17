package school.sptech.ex2;

public class TesteEncomendas {
    public static void main(String[] args) {
        Encomenda encomenda = new Encomenda();

        encomenda.tamanho = "P";
        encomenda.enderecoRemetente = "Rua Santos da Glória, 18";
        encomenda.enderecoDestinatario = "Av Dr. Pedro, 255";
        encomenda.distancia = 330.0;
        encomenda.valorProduto = 100.0;

        System.out.println(encomenda.calcularFrete());
    }
}
