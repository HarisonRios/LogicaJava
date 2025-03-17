package school.sptech.ex2;

public class Encomenda {
    String tamanho;
    String enderecoRemetente;
    String enderecoDestinatario;
    Double distancia;
    Double valorProduto;

    double calcularFrete() {
        double frete = 0;
        switch (tamanho) {
            case "P":
                frete += valorProduto * 0.01;
                break;
            case "M":
                frete += valorProduto * 0.03;
                break;
            case "G":
                frete += valorProduto * 0.05;
                break;
        }

        if (distancia <= 50) {
            frete += 3.00;
        } else if (distancia <= 200) {
            frete += 5.00;
        } else {
            frete += 7.00;
        }

        return frete;
    }

    void aplicarCupomDeDesconto(Integer percentual) {
        Double desconto = (percentual / 100.0) * valorProduto;
        valorProduto -= desconto;
    }

    Double valorTotalDaEncomenda() {
        return calcularFrete() + valorProduto;
    }


}
