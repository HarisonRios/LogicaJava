package school.sptech.ex1;

public class Bolo {
    String sabor;
    Double valor;
    Integer quantidadeVendida = 0;
    Integer quantidadeEmEstoque = 0;

    Integer venderBolo(Integer quantidade) {
        if (quantidade <= 0 || quantidade > quantidadeEmEstoque) {
            return 0;
        }
        quantidadeVendida += quantidade;
        quantidadeEmEstoque -= quantidade;
        return quantidade;
    }

    boolean aumentarEstoque(Integer quantidade){
        if(quantidade < 0){
            return false;
        }
        quantidadeEmEstoque += quantidade;
        return true;
    }

    Integer quantidadeDisponivel(){
        if(quantidadeEmEstoque == 0){
            return 0;
        }
        return quantidadeEmEstoque;
    }

    Double totalVendido(){
        return quantidadeVendida * valor;
    }
}



