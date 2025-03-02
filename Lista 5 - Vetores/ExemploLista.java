package school.sptech;
import java.util.ArrayList;
import java.util.List;

public class ExemploLista {
    public static void main(String[] args) {
        List<Integer>lista;
        lista = new ArrayList<>();
        lista.add(100);
        lista.add(60);
        lista.add(1,75);
        lista.set(2,99);
        lista.remove(0);



        Integer valor = 75;
        lista.remove(valor);

        System.out.println(valor);
        System.out.println(lista);


        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Banana");
        frutas.add("Maçã");
        frutas.add("Pera");
        frutas.add("Uva");

        frutas.remove("Pera");
        System.out.println(frutas);

        for (String fruta : frutas) {
            System.out.println(fruta);
        }


    }
}
