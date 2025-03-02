package school.sptech;

public class ExercicioVetores {

    Integer somar(Integer[] vetor) {
        Integer soma = 0;
        for (Integer i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        return soma;
    }
    Double calcularMedia(Double[] notas) {
        Double soma = 0.0;
        for (Integer i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        return soma / notas.length;
    }

    Integer buscarMaiorNumero(Integer[] vetor){
        Integer maior = vetor[0];
        for (Integer i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }

    Integer calcularDecimal(Integer[] binario){
        int decimal = 0;
        for(Integer i = 0; i < binario.length; i++){
            decimal += binario[i] * Math.pow(2, binario.length - 1 - i);
        }
        return decimal;
    }

    Character[] inverter(Character[] vetor){
        Character[] resultado = new Character[vetor.length];
        for(int i = 0; i < vetor.length; i++){
            resultado[i] = vetor[vetor.length - 1 - i];
        }
        return resultado;
    }

    Integer[] somarDois(Integer[] vetor, Integer alvo){
        Integer[] resultado = new Integer[2];
        for(int i = 0; i < vetor.length; i++){
            for(int j = i + 1; j < vetor.length; j++){
                if(vetor[i] + vetor[j] == alvo){
                    resultado[0] = i;
                    resultado[1] = j;
                    return resultado;
                }
            }
        }
        return resultado;
    }
}

