package school.sptech;
import javax.swing.JOptionPane;
import java.util.concurrent.ThreadLocalRandom;

public class exemplo7 {
    public static void main(String[] args) {
       // Math.ramdom();

        Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(10,20);
        System.out.println(numeroAleatorio);
    }
}


public class EntradaDialogo {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        JOptionPane.showMessageDialog(null, "Olá, " + nome + "!");
    }
}
