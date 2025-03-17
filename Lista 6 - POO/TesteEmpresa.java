package school.sptech.ex3;

public class TesteEmpresa {

  public static void main(String[] args) {
    Funcionario funcionario = new Funcionario();

    funcionario.reajustarSalario(10);
    System.out.println(funcionario.salario);

  }
}
