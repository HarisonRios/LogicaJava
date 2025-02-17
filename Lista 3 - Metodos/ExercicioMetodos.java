package school.sptech;

public class ExercicioMetodos {
    Boolean  verificarMaioridade(Integer idade) {
        if (idade >= 18) {
            return true;
        } else {
            return false;
        }
    }

    Double calcularMedia(Double valor1, Double valor2, Double valor3){
        return (valor1 + valor2 + valor3) / 3;
    }

    Integer maiorNumero(Integer valor1, Integer valor2, Integer valor3){
        if(valor1 > valor2 && valor1 > valor3){
            return valor1;
        } else if (valor2 > valor1 && valor2 > valor3){
            return valor2;
        } else if(valor3 > valor1 && valor3 > valor2) {
            return valor3;
        }
        return valor1;
    }

    Integer calcularFatorial(Integer valor){
        Integer resultado = 1;
        for(int i = 1; i <= valor; i++){
            resultado = resultado * i;
        }
        return resultado;
    }

    Boolean verificarPrimo(Integer valor){
        if(valor <= 1){
            return false;
        }
           for (int i = 2; i < valor; i++) {
           if(valor % i == 0){
               return false;
           }
        }
        return true;
    }

    Integer calcularPotencia(Integer base, Integer expoente){
        Integer basePotencia = 1;
        for(int i = 0; i < expoente; i++){
            basePotencia = basePotencia * base;
        }
        return basePotencia;
    }

//    Integer calcularTrocoEmBalas(Double valorCompra, Double valorRecebido){
//       Integer troco = 0;
//    }









}
