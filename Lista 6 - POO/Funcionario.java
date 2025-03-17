package school.sptech.ex3;

public class Funcionario {
    String nome;
    String cargo;
    Double salario;

    Double reajustarSalario(Integer percentual) {
        salario *= (1 + percentual / 100.0);
        return salario;
    }

    Double calcularValorHora() {
        return salario / 220.0;
    }

    Double calcularHoraExtra(Integer horasTrabalhadas, Integer percentualNoturno) {
        return horasTrabalhadas * calcularValorHora() * (1 + percentualNoturno / 100.0);
    }
}
