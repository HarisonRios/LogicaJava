package school.sptech;

public class exemplo6 {
    public static void main(String[] args) {
        // console.log("Meu nome é ${nome}, meu peso é ${peso}, e minha altura é ${altura})
        String nome = "Harison";
        Integer idade = 24;
        Double peso = 60.4;

        String mensagem = String.format("Meu nome é %s, tenho %d, anos e peso %f", nome, idade, peso);
                // %s = STRING , %D NUMERO INTEIROS E %F DOUBLE (NUMEROS QUEBRADOS)
        System.out.println(mensagem);
    }
}
